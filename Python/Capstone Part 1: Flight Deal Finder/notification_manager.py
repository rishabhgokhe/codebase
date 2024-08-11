import config
from twilio.rest import Client
from flight_search import FlightSearch

flight_search = FlightSearch()

TWILIO_ACCOUNT_SID = config.TWILIO_ACCOUNT_SID
TWILIO_AUTH_TOKEN = config.TWILIO_AUTH_TOKEN
TWILIO_PHONE_NUMBER = config.TWILIO_PHONE_NUMBER


class NotificationManager:

    def send_alert(self, departure_city_name):
        account_sid = TWILIO_ACCOUNT_SID
        auth_token = TWILIO_AUTH_TOKEN
        client = Client(account_sid, auth_token)

        client.messages.create(
            from_=TWILIO_PHONE_NUMBER,
            body=flight_search.check_flights(departure_city_name),
            to=config.MY_PHONE_NUMBER
        )

        # print(message.sid)
