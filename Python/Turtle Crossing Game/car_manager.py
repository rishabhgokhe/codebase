from turtle import Turtle
import random
COLORS = ["red", "orange", "yellow", "green", "blue", "purple"]
STARTING_MOVE_DISTANCE = 5
MOVE_INCREMENT = 4


class CarManager:

    def __init__(self):
        self.all_cars = []
        self.starting_move_distance = STARTING_MOVE_DISTANCE
        self.move_increment = MOVE_INCREMENT

    def generate_car(self):
        random_chance = random.randint(1, 6)
        if random_chance == 1:
            new_car = Turtle("square")
            new_car.shapesize(stretch_wid=1, stretch_len=2)
            new_car.penup()
            new_car.color(random.choice(COLORS))
            new_car.goto(300, random.randint(-250, 250))
            self.all_cars.append(new_car)

    def move(self):
        for car in self.all_cars:
            car.backward(self.starting_move_distance)

    def increase_speed(self):
        self.starting_move_distance += self.move_increment
