import os
import requests
from twilio.rest import Client
from twilio.http.http_client import TwilioHttpClient
import config

OWM_endpoint = "https://api.openweathermap.org/data/2.5/forecast"
api_key = config.api_key
account_sid = config.account_sid
auth_token = config.auth_token

weather_params = {
    "lat": 21.581301,
    "lon": 78.858299,
    "appid": api_key,
    "cnt": 4
}

response = requests.get(url=OWM_endpoint, params=weather_params)
response.raise_for_status()
weather_data = response.json()
it_will_rain = False
for hour_data in weather_data["list"]:
    weather_code = hour_data["weather"][0]["id"]
    if weather_code > 700:
        it_will_rain = True
if it_will_rain:
    proxy_client = TwilioHttpClient()
    proxy_client.session.proxies = {"https": os.environ['https_proxy']}
    client = Client(account_sid, auth_token, http_client=proxy_client)
    message = client.messages \
        .create(
         body="It's going to rain today. Remember to bring an umbrella",
         from_="+1234567890",
         to="your verified number"
    )
