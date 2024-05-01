import time
from turtle import Screen
from snake import Snake
from food import Food
from scoreboard import Scoreboard

screen = Screen()
screen.setup(600, 600)
screen.bgcolor("black")
screen.title("My Snake Game")
screen.tracer(0)

snake = Snake()
food = Food()
scoreboard = Scoreboard()

screen.listen()
# Here we are a calling functions from snake into an onkey function so
# while calling a function into another function we don't use parentheses
screen.onkey(snake.up, "Up")
screen.onkey(snake.down, "Down")
screen.onkey(snake.right, "Right")
screen.onkey(snake.left, "Left")

game_is_on = True
while game_is_on:
    screen.update()
    time.sleep(0.1)
    snake.move()

    # Detect collision with food
    if snake.head.distance(food) < 15:
        food.generate_food()
        scoreboard.increase_score()
        snake.extend_snake()

    # Detect collision with wall
    if snake.head.xcor() > 280 or snake.head.xcor() < -280 or snake.head.ycor() > 280 or snake.head.ycor() < -280:
        game_is_on = False
        scoreboard.game_over()

    # Detect collision with own tail
    for segment in snake.segments[1:]:
        if snake.head.distance(segment) < 10:
            game_is_on = False
            scoreboard.game_over()

screen.exitonclick()

# TODO-1 : Setup screen width,height,color and title
# TODO-2 : Make 3 segments of the snake
# TODO-3 : Make your snake to move
# TODO-4 : Control your snake with Up,Down,Left,Right keys
# TODO-5 : Check for the direct opposite movement for ex. snake head is pointing up so it can't be moved directly down
# TODO-6 : Generate food at random points
# TODO-7 : Detect collision with food
# TODO-8 : Create a scoreboard and increase score by 1 everytime the snake hits the food
# TODO-9 : Detect collision with wall
# TODO-10 : Create a game-over screen everytime snake hits the wall
# TODO-11 : Create a method to extent snake in snake.py everytime it hits the food
# TODO-12 : Detect collision with tail and trigger the game-over screen
