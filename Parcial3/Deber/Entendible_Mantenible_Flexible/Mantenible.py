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
    
    def update_details(self, year=None, color=None):    #Metodo para actualizar los detalles del auto
        if year:                                        #Si el año no es None
            self.year = year                            #None es un valor nulo
        if color:                                       #Si el color no es None
            self.color = color

class CarInventory:
    def __init__(self):
        self.cars = []                                  # Lista para almacenar los autos en el inventario

    def add_car(self, car):
        if isinstance(car, Car):                        #isinstance() verifica si es una instancia de la clase Car
            if car not in self.cars:
                self.cars.append(car)
            else:
                raise ValueError("El carro ya existe en el inventario.")
        else:
            raise ValueError("Solo intancias de carros se agregaran al inventario.")

    def remove_car(self, car):
        if car in self.cars:
            self.cars.remove(car)
        else:
            raise ValueError("El carro no se encuentra en el inventario.")

    def search_by_make(self, make):
        return [car for car in self.cars if car.get_make() == make] 

    def search_by_model(self, model):
        return [car for car in self.cars if car.get_model() == model] 

    def search_by_year(self, year):
        return [car for car in self.cars if car.get_year() == year] 

    def search_by_color(self, color):
        return [car for car in self.cars if car.get_color() == color]   
    
def main():
    # Creamos instancias de carros
    car1 = Car("Toyota", "Supra", 2000, "Azul")
    car2 = Car("Ford", "Mustang", 2022, "Rojo")
    car3 = Car("Koegnigsegg", "Agera", 2016, "Negro")

    # Creamos el inventario de carros
    inventory = CarInventory()

    # Agregamos carros al inventario
    inventory.add_car(car1)
    inventory.add_car(car2)
    inventory.add_car(car3)

    # Imprimimos el inventario de carros
    print("Inventario de Carros:")
    for car in inventory.cars:
        print(f"{car.get_make()} {car.get_model()} ({car.get_year()}), Color: {car.get_color()}")

    # Actualizamos los detalles de un carro en el inventario
    inventory.cars[0].update_details(year=2021, color="Blanco")

    # Buscamos carros por atributo
    print("\nBúsqueda de carros por atributo:")
    search_make = inventory.search_by_make("Ford")
    search_color = inventory.search_by_color("Negro")

    # Imprimimos los resultados de la búsqueda
    print("Carros encontrados por marca 'Ford':")
    for car in search_make:
        print(f"{car.get_make()} {car.get_model()} ({car.get_year()}), Color: {car.get_color()}")

    print("\nCarros encontrados por color 'Negro':")
    for car in search_color:
        print(f"{car.get_make()} {car.get_model()} ({car.get_year()}), Color: {car.get_color()}")

if __name__ == "__main__":
    main()