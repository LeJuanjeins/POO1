from abc import ABC, abstractmethod

class Shape(ABC):
    @abstractmethod
    def calculate_area(self):
        pass

class Rectangle(Shape):
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def calculate_area(self):
        return self.width * self.height

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def calculate_area(self):
        return 3.14159 * self.radius * self.radius

class AreaCalculator:
    def calculate_area(self, shape):
        return shape.calculate_area()

def main():
    rectangle = Rectangle(5, 10)
    circle = Circle(7)

    calculator = AreaCalculator()
    print("Rectangle Area:", calculator.calculate_area(rectangle))
    print("Circle Area:", calculator.calculate_area(circle))

if __name__ == "__main__":
    main()
