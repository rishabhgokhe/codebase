import requests
import config

YOUR_ENDPOINT = "https://tequila-api.kiwi.com/locations/query?term="
YOUR_API_KEY = config.FLIGHT_API_KEY

headers = {
    "apikey": YOUR_API_KEY
}


class FlightData:

    def __init__(self):
        self.iata_code = ""

    def get_iata_city(self, city):
        response = requests.get(url=YOUR_ENDPOINT + f"{city}", headers=headers)
        data = response.json()
        self.iata_code = data["locations"][0]["code"]
        return self.iata_code
