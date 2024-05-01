import requests
from datetime import datetime
import config

USERNAME = config.USERNAME
TOKEN = config.TOKEN
GRAPH_ID = config.GRAPH_ID

# ------------Creating Account on Pixela------------ #
pixela_endpoint = "https://pixe.la/v1/users"

user_params = {
    "token": TOKEN,
    "username": USERNAME,
    "agreeTermsOfService": "yes",
    "notMinor": "yes"
}

# response = requests.post(url=pixela_endpoint, json=user_params)
# print(response.text)

# ------------Adding Graph on Pixela------------ #
graph_endpoint = f"{pixela_endpoint}/{USERNAME}/graphs"

graph_config = {
    "id": "graph365",
    "name": "Coding Graph",
    "unit": "Hours",
    "type": "float",
    "color": "shibafu",
    "timezone": "Asia/Kolkata"
}

headers = {
    "X-USER-TOKEN": TOKEN
}

# response = requests.post(url=graph_endpoint, json=graph_config, headers=headers)
# print(response.text)

# ------------Adding pixels on Graph in Pixela------------ #
pixel_post_endpoint = f"{graph_endpoint}/{GRAPH_ID}"
today_date = datetime.now().strftime("%Y%m%d")

pixel_post_details = {
    "date": today_date,
    "quantity": "4.0"
}
# response = requests.post(url=pixel_post_endpoint, json=pixel_post_details, headers=headers)
# print(response.text)

# ------------Updating Pixels on Pixela------------ #
update_endpoint = f"{pixela_endpoint}/{USERNAME}/graphs/{GRAPH_ID}/20240107"
new_pixel_data = {
    "quantity": "5.0"
}

# response = requests.put(url=update_endpoint, json=new_pixel_data, headers=headers)
# print(response.text)

# ------------Deleting Pixels on Pixela------------ #
delete_endpoint = f"{pixela_endpoint}/{USERNAME}/graphs/{GRAPH_ID}/{today_date}"

# response = requests.delete(url=delete_endpoint, headers=headers)
# print(response.text)
