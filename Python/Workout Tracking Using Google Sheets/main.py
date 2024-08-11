import requests
from datetime import datetime
import config

APP_ID = config.APP_ID
API_KEY = config.API_KEY
API_ENDPOINT = "https://trackapi.nutritionix.com/v2/natural/exercise"
SHEETY_API_ENDPOINT = "https://api.sheety.co/2443486378d1e2923cd4314af6a1e873/workoutTraining/workouts"
TOKEN = config.TOKEN

headers = {
    "x-app-id": APP_ID,
    "x-app-key": API_KEY
}

exercise_text = input("Tell me which exercise you did : ")

PARAMS = {
    "query": exercise_text,
    "gender": "male",
    "weight_kg": 64,
    "height_cm": 170,
    "age": 19
}

response = requests.post(url=API_ENDPOINT, json=PARAMS, headers=headers)
result = response.json()
print(result)

today = datetime.now().date().strftime("%d/%m/%Y")
time = datetime.now().time().strftime("%X")
print(today)
print(time)

for exercise in result["exercises"]:
    sheet_input = {
        "workout": {
            "date": today,
            "time": time,
            "exercise": exercise["name"].title(),
            "duration": exercise["duration_min"],
            "calories": exercise["nf_calories"],
        }
    }

    sheet_response = requests.post(url=SHEETY_API_ENDPOINT, json=sheet_input, headers=TOKEN)
    print(sheet_response)
