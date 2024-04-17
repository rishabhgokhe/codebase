import requests
import config
from datetime import datetime, timedelta
from data_manager import DataManager

data_manager = DataManager()
data = data_manager.get_destination_data()

FLIGHT_SEARCH_ENDPOINT = "https://tequila-api.kiwi.com/v2/search"
YOUR_API_KEY = config.FLIGHT_API_KEY
today_date = datetime.date(datetime.today()).strftime("%d/%m/%Y")
today_after_6months = (datetime.date(datetime.today()) + timedelta(days=180)).strftime("%d/%m/%Y")

headers = {
    "apikey": YOUR_API_KEY
}


class FlightSearch:

    def __init__(self):
        self.price = data
        self.departure_airport_code = 0
        self.departure_city = 0

    def check_flights(self, departure_city_name):
        for city in data:
            query = {
                "fly_from": departure_city_name,
                "fly_to": city['iataCode'],
                "date_from": today_date,
                "date_to": today_after_6months,
                "nights_in_dst_from": 7,
                "nights_in_dst_to": 28,
                "one_for_city": 1,
                "curr": "INR"
            }
            response = requests.get(url=FLIGHT_SEARCH_ENDPOINT, params=query, headers=headers)
            flight_data = response.json()["data"][0]
            price = int(flight_data['price'])
            departure_city_name = flight_data["cityFrom"]
            departure_airport_iata_code = flight_data["flyFrom"]
            arrival_city_name = flight_data["cityTo"]
            arrival_airport_iata_code = flight_data["flyTo"]
            out_date = flight_data["local_departure"].split("T")[0]
            return_date = flight_data["local_departure"].split("T")[0]
            # print(f"{price} {departure_city_name} {departure_airport_iata_code} {arrival_city_name} {
            # arrival_airport_iata_code} {out_date} {return_date}")

            if price < city['lowestPrice']:
                return (f"Low Price Alert ‼️‼️‼️ Only {price}₹ to fly from {departure_city_name}"
                        f"-{departure_airport_iata_code} to {arrival_city_name}-{arrival_airport_iata_code},"
                        f" from {out_date} to {return_date}")
