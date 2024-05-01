# This file will need to use the DataManager,FlightSearch, FlightData, NotificationManager classes to achieve the
# program requirements.
from data_manager import DataManager
from notification_manager import NotificationManager

data_manager = DataManager()
data_manager.update_destination_codes()

notification_manager = NotificationManager()
notification_manager.send_alert("BOM")
