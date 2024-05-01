import requests
import math
import datetime as dt
import smtplib

MY_EMAIL = "my_email@gmail.com"  # Enter your valid email
MY_PASSWORD = "my_password"  # Enter your email's correct password
MY_LAT = 21.580258
MY_LONG = 78.858232
parameters = {
    "lat": MY_LAT,
    "lng": MY_LONG,
    "formatted": 0,
}

utc_difference = 330  # +5 Hours and 30 min


def utc_to_local(utc_hour, utc_min):
    utc_time = utc_hour * 60 + utc_min
    total_hour = (utc_time + utc_difference) / 60
    return math.floor(total_hour % 24)


def is_iss_overhead():
    response_iss = requests.get(url="http://api.open-notify.org/iss-now.json")
    response_iss.raise_for_status()
    data_iss = response_iss.json()
    iss_longitude = float(data_iss['iss_position']['longitude'])
    iss_latitude = float(data_iss['iss_position']['latitude'])
    # Your position is within +5 or -5 degrees of the iss
    if MY_LAT - 5 <= iss_latitude <= MY_LAT + 5 and MY_LONG - 5 <= iss_longitude <= MY_LONG + 5:
        return True


def is_nighttime():
    response = requests.get(url="https://api.sunrise-sunset.org/json", params=parameters)
    response.raise_for_status()
    data = response.json()

    sunrise_hour = int(data['results']['sunrise'].split('T')[1].split(":")[0])
    sunrise_min = int(data['results']['sunrise'].split('T')[1].split(":")[1])
    sunset_hour = int(data['results']['sunset'].split('T')[1].split(":")[0])
    sunset_min = int(data['results']['sunset'].split('T')[1].split(":")[1])
    sunrise_time = utc_to_local(sunrise_hour, sunrise_min)
    sunset_time = utc_to_local(sunset_hour, sunset_min)
    time_hour = dt.datetime.now().hour
    if sunrise_time >= time_hour >= sunset_time:
        return True


if is_iss_overhead() and is_nighttime():
    with smtplib.SMTP("smtp@gmai.com") as connection:
        connection.starttls()
        connection.login(user=MY_EMAIL, password=MY_PASSWORD)
        connection.sendmail(
            from_addr=MY_EMAIL,
            to_addrs=MY_EMAIL,
            msg="Subject:Look up!!\n\nThe ISS is above you up in the sky"
        )
# Sunset and sunrise API link: https://sunrise-sunset.org/api
# ISS Current Location API link: http://open-notify.org/Open-Notify-API/ISS-Location-Now/
# Find your current latitude: https://www.latlong.net/
