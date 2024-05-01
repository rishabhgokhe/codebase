from turtle import Turtle, Screen
import random
new_turtle = Turtle()

is_game_on = False
screen = Screen()
screen.setup(width=500, height=400)
user_bet = screen.textinput(title="Make your bet", prompt="Which turtle will win the race? Enter a color: ")
colors = ["red", "orange", "yellow", "blue", "purple", "green"]
y_position = [-70, -40, -10, 20, 50, 80]
turtle_list = []


for turtle_index in range(0, 6):
    new_turtle = Turtle(shape="turtle")
    new_turtle.color(colors[turtle_index])
    new_turtle.penup()
    new_turtle.goto(x=-230, y=y_position[turtle_index])
    turtle_list.append(new_turtle)

if user_bet:
    is_game_on = True

while is_game_on:
    for turtle in turtle_list:
        turtle.forward(random.randint(1, 10))
        if turtle.xcor() > 230:
            is_game_on = False
            winning_color = turtle.pencolor()
            if user_bet == winning_color:
                print(f"you won the race.{winning_color} turtle is at first position")
            else:
                print(f"you lost the race.{winning_color} turtle is at first position")

screen.exitonclick()
