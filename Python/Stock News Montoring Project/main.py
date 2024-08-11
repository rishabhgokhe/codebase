import random
import requests
from datetime import datetime, timedelta
import pytz
import config
from twilio.rest import Client

STOCK = "TSLA"
COMPANY_NAME = "Tesla Inc"

STOCK_PARAMS = {
    "function": "TIME_SERIES_DAILY",
    "symbol": STOCK,
    "outputsize": "compact",
    "datatype": "json",
    "apikey": config.stock_api_key
}

NEWS_PARAMS = {
    "q": "Tesla",
    "from": str(datetime.now(pytz.timezone("America/New_York")).date()-timedelta(days=1)),
    "sortBy": "popularity",
    "language": "en",
    "apiKey": config.news_api_key
}

# Use https://www.alphavantage.co
# When STOCK price increase/decreases by 5% between yesterday and the day before yesterday then print("Get News").
response = requests.get(url="https://www.alphavantage.co/query", params=STOCK_PARAMS)
stock_data = response.json()

time_zone = pytz.timezone("America/New_York")
nasdaq_time = datetime.now(time_zone)

if nasdaq_time.hour > 9 and nasdaq_time.minute > 30:
    today_date = datetime.now(time_zone).date()
    yesterdays_date = today_date - timedelta(days=1)
    today_open = stock_data["Time Series (Daily)"][str(today_date)]["1. open"]
    yesterdays_close = stock_data["Time Series (Daily)"][str(yesterdays_date)]["4. close"]
    if nasdaq_time.hour > 21:
        today_date = datetime.now(time_zone).date()
        today_open = stock_data["Time Series (Daily)"][str(today_date)]["1. open"]
        yesterdays_close = stock_data["Time Series (Daily)"][str(today_date)]["4. close"]
else:
    today_date = datetime.now(time_zone).date() - timedelta(days=2)
    yesterdays_date = datetime.now(time_zone).date() - timedelta(days=3)
    today_open = stock_data["Time Series (Daily)"][str(today_date)]["1. open"]
    yesterdays_close = stock_data["Time Series (Daily)"][str(yesterdays_date)]["4. close"]

difference = float(today_open) - float(yesterdays_close)
if difference < 0:
    diff_per = round((difference*100)/float(yesterdays_close), 2)
    stock_msg = f"{today_open}-{yesterdays_close}=🔻{diff_per}%"
else:
    diff_per = round((difference*100)/float(yesterdays_close), 2)
    stock_msg = f"{today_open}-{yesterdays_close}=🔺{diff_per}%"


# Use https://newsapi.org
# Instead of printing ("Get News"), actually get the first 3 news pieces for the COMPANY_NAME.

news_response = requests.get(url="https://newsapi.org/v2/everything", params=NEWS_PARAMS)
news_data = news_response.json()
news_number = random.randint(0, 5)
news_article_title = news_data["articles"][news_number]["title"]
news_article_description = news_data["articles"][news_number]["description"]
news_article_link = news_data["articles"][news_number]["url"]

news_message = (f" Stock: {stock_msg}\nTitle: {news_article_title}\nDescription: {news_article_description}\n"
                f"get full article on {news_article_link}")


# Use https://www.twilio.com
# Send a separate message with the percentage change and each article's title and description to your phone number.
# Download the helper library from https://www.twilio.com/docs/python/install

account_sid = config.twilio_account_sid
auth_token = config.twilio_auth_token
client = Client(account_sid, auth_token)

message = client.messages \
                .create(
                     body=news_message,
                     from_=config.twilio_number,
                     to='+919098447696  '
                 )

print(message.sid)

# Optional: Format the SMS message like this:
"""
TSLA: 🔺2%
Headline: Were Hedge Funds Right About Piling Into Tesla Inc. (TSLA)?. 
Brief: We at Insider Monkey have gone over 821 13F filings that hedge funds and prominent 
investors are required to file by the SEC The 13F filings show the funds' and investors' 
portfolio positions as of March 31st, near the height of the coronavirus market crash.
or
"TSLA: 🔻5%
Headline: Were Hedge Funds Right About Piling Into Tesla Inc. (TSLA)?. 
Brief: We at Insider Monkey have gone over 821 13F filings that hedge funds and prominent 
investors are required to file by the SEC The 13F filings show the funds' and investors' portfolio 
positions as of March 31st, near the height of the coronavirus market crash.
"""