class Car:
    def __init__(self, make, model, year, color):
        self.make = make
        self.model = model
        self.year = year
        self.color = color

    def get_make(self):
        return self.make

    def get_model(self):
        return self.model

    def get_year(self):
        return self.year

    def get_color(self):
        return self.color

class CarInventory:
    def __init__(self):
        self.cars = []          # Lista para almacenar los autos en el inventario

    def add_car(self, car):
        self.cars.append(car)   # Agrega un auto al inventario

    def remove_car(self, car):
        self.cars.remove(car)   # Remueve el auto del inventario

    def search_by_make(self, make):
        return [car for car in self.cars if car.get_make() == make] # Busca el auto por marca

    def search_by_model(self, model):
        return [car for car in self.cars if car.get_model() == model]   # Busca el auto por modelo

    def search_by_year(self, year):
        return [car for car in self.cars if car.get_year() == year] # Busca el auto por año

    def search_by_color(self, color):
        return [car for car in self.cars if car.get_color() == color]   # Busca el auto por color