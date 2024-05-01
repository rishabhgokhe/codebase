from turtle import Screen
from paddle import Paddle
from ball import Ball
from scoreboard import Scoreboard
import time

screen = Screen()

screen.setup(width=800, height=600)
screen.bgcolor("black")
screen.title("Pong: The Famous Arcade Game")
screen.tracer(0)

ball = Ball()
l_paddle = Paddle((380, 0))
r_paddle = Paddle((-380, 0))
scoreboard = Scoreboard()

screen.listen()
screen.onkey(l_paddle.up, "Up")
screen.onkey(l_paddle.down, "Down")
screen.onkey(r_paddle.up, "w")
screen.onkey(r_paddle.down, "s")


game_is_on = True
while game_is_on:
    screen.update()
    time.sleep(0.1)
    ball.move()

    # Detect collision with walls
    if ball.ycor() > 280 or ball.ycor() < -280:
        ball.bounce_y()

    # Detect collision with paddle
    if ball.distance(l_paddle) < 10 or ball.distance(r_paddle) < 10:
        ball.bounce_x()

    # Calculate Score
    if ball.xcor() > 380:
        ball.restart()
        scoreboard.l_point()
        # l_score.update_scoreboard()

    elif ball.xcor() < -380:
        scoreboard.r_point()
        # r_score.update_scoreboard()
        ball.restart()


screen.exitonclick()
