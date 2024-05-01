from tkinter import *

THEME_COLOR = "#375362"


class QuizInterface:

    def __init__(self, quiz_brain):
        self.window = Tk()
        self.quiz = quiz_brain
        self.window.title("Quizzler")
        self.window.config(padx=20, pady=20, bg=THEME_COLOR)
        self.score_label = Label(text="score:0", fg='white', bg=THEME_COLOR)
        self.score_label.grid(column=1, row=0)

        self.canvas = Canvas(width=300, height=250, bg="white", highlightthickness=0)
        self.question_text = self.canvas.create_text(150, 125,
                                                     text=self.quiz.next_question(),
                                                     font=("Arial", 20, "italic"),
                                                     fill=THEME_COLOR,
                                                     width=250)
        self.canvas.grid(column=0, row=1, columnspan=2, pady=20)

        tick_png = PhotoImage(file="./images/true.png")
        cross_png = PhotoImage(file="./images/false.png")
        self.tick_button = Button(image=tick_png, highlightthickness=0, borderwidth=0, command=self.true_pressed)
        self.tick_button.grid(column=0, row=2)
        self.cross_button = Button(image=cross_png, highlightthickness=0, borderwidth=0, command=self.false_pressed)
        self.cross_button.grid(column=1, row=2)

        self.window.mainloop()

    def true_pressed(self):
        self.quiz.check_answer("True")

    def false_pressed(self):
        self.quiz.check_answer("False")
