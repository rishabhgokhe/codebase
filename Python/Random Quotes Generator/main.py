from tkinter import *
import requests


def get_quote():
    response = requests.get(url="https://api.kanye.rest")
    response.raise_for_status()
    quotes = response.json()
    canvas.itemconfig(quote_text, text=quotes['quote'])


window = Tk()
window.title("Kanye Says...")
window.config(padx=50, pady=50, bg="white")

canvas = Canvas(width=300, height=414, bg="white", highlightthickness=0)
background_img = PhotoImage(file="background.png")
quote_bubble = canvas.create_image(153, 207, image=background_img)
quote_text = canvas.create_text(153, 207, text="Kanye Quote Goes HERE", width=250, font=("Arial", 30, "bold"),
                                fill="white")
canvas.grid(row=0, column=0)

kanye_img = PhotoImage(file="kanye.png")
kanye_button = Button(image=kanye_img, highlightthickness=0, command=get_quote, borderwidth=0)
kanye_button.grid(row=1, column=0)

window.mainloop()

# kanye_rest documentation link : https://kanye.rest/
