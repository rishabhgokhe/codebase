from tkinter import *
import pandas
import random

current_card = {}


# ------------------------------ SHOW ANSWER ---------------------------- #
def show_answer():
    canvas.create_image(400, 263, image=card_front_img)
    canvas.itemconfig(card_title, text="English", fill="black")
    canvas.itemconfig(card_word, text=current_card["English"], fill="black")
    canvas.after(3000, show_answer)


# ------------------------------ GENERATE RANDOM WORD ---------------------------- #
data = pandas.read_csv("data/french_words.csv")
word_dict = data.to_dict(orient="records")


def new_card():
    global current_card
    current_card = random.choice(word_dict)
    # random_french_word = random_list["French"]
    # random_english_word = random_list["English"]
    canvas.itemconfig(card_title, text="French")
    canvas.itemconfig(card_word, text=current_card["French"])


# ---------------------------------------------------------------------------- #
BACKGROUND_COLOR = "#B1DDC6"

window = Tk()
window.title("FLASHY")
window.config(padx=50, pady=50, bg=BACKGROUND_COLOR)

canvas = Canvas(width=800, height=526, highlightthickness=0)

card_back_img = PhotoImage(file="./images/card_back.png")
card_front_img = PhotoImage(file="./images/card_front.png")
right_tick_img = PhotoImage(file="./images/right.png")
wrong_cross_img = PhotoImage(file="./images/wrong.png")

canvas.create_image(400, 263, image=card_back_img)
canvas.grid(column=0, row=0, columnspan=2)
canvas.config(bg=BACKGROUND_COLOR, highlightthickness=0)
card_title = canvas.create_text(400, 150, text="", font=("Ariel", 40, "italic"))
card_word = canvas.create_text(400, 263, text="", font=("Ariel", 60, "bold"))

tick_button = Button(image=right_tick_img, highlightthickness=0, borderwidth=0, command=new_card)
tick_button.grid(column=1, row=1)

cross_button = Button(image=wrong_cross_img, highlightthickness=0, borderwidth=0, command=new_card)
cross_button.grid(column=0, row=1)

new_card()
show_answer()
window.mainloop()