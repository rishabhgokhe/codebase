import requests
import config
from flight_data import FlightData


SHEETY_PRICES_ENDPOINT = config.SHEETY_ENDPOINT

flight_data = FlightData()


class DataManager:

    def __init__(self):
        self.destination_data = {}

    def get_destination_data(self):
        response = requests.get(url=SHEETY_PRICES_ENDPOINT)
        data = response.json()
        self.destination_data = data["prices"]
        return self.destination_data

    def modifiy_row(self, city_code, id_city):
        put_response = requests.put(url=f"{SHEETY_PRICES_ENDPOINT}/{id_city}",
                                    json={"price": {"iataCode": city_code}})
        return put_response.json()

    def update_destination_codes(self):
        for city in self.destination_data:
            if city["iataCode"] == "":
                city_code = flight_data.get_iata_city(city["city"])
                if city_code is None:
                    print(f"City location not found: {city['city']}")
                else:
                    print(self.modifiy_row(city_code, city["id"]))
