from turtle import Turtle
FONT = ("Courier", 24, "normal")


class Scoreboard(Turtle):

    def __init__(self):
        super().__init__()
        self.level = 0
        self.penup()
        self.hideturtle()

    def increase_level(self):
        self.clear()
        self.level += 1
        self.goto(-230, 270)
        self.write(f"LEVEL: {self.level}", align="center", font=FONT)

    def game_over(self):
        self.goto(0, 0)
        self.write("GAME-OVER", align="center", font=FONT)
