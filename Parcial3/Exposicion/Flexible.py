from abc import ABC, abstractmethod                 #Importar libreria para crear clases abstractas

class Vehicle(ABC):                                 #Clase abstracta
    def __init__(self, make, model, year, color):
        self.make = make
        self.model = model
        self.year = year
        self.color = color

    @abstractmethod                                 #Metodo abstracto
    def get_type(self):                             #Metodo para obtener el tipo de vehiculo
        pass                                        #No hace nada pass es para que no de error

class Car(Vehicle):                                 #Clase hija de Vehicle
    def __init__(self, make, model, year, color):
        super().__init__(make, model, year, color)  #Llama al constructor de la clase padre

    def get_type(self):                             #Metodo para obtener el tipo de vehiculo
        return "Car"                                #Retorna el tipo de vehiculo

class Motorcycle(Vehicle):
    def __init__(self, make, model, year, color):
        super().__init__(make, model, year, color)

    def get_type(self):
        return "Motorcycle"

class CarInventory:
    def __init__(self):
        self.vehicles = []        # Lista para almacenar los autos en el inventario

    def add_vehicle(self, vehicle): # Agrega un auto al inventario
        if isinstance(vehicle, Vehicle):    #Verifica si es una instancia de la clase Vehicle
            self.vehicles.append(vehicle)   #append() agrega un elemento a la lista
        else:
            raise ValueError("Solo se pueden agregar instancias de la clase Vehicle al inventario.")    #Lanza un error si no es una instancia de la clase Vehicle

    def remove_vehicle(self, vehicle):  
        if vehicle in self.vehicles:    
            self.vehicles.remove(vehicle)       
        else:
            raise ValueError("El vehículo no se encuentra en el inventario.")   #Lanza un error si el vehiculo no esta en el inventario

    def search_by_attribute(self, attribute, value):                #Metodo para buscar un vehiculo por atributo
        return [vehicle for vehicle in self.vehicles if getattr(vehicle, attribute) == value]       #Retorna una lista con los vehiculos que coincidan con el atributo y el valor
                                                                                                    #getattr() obtiene el valor del atributo
    def print_inventory(self):
        print("Inventario de Vehículos:")
        for vehicle in self.vehicles:
            print(f"{vehicle.get_type()}: {vehicle.make} {vehicle.model} ({vehicle.year}), Color: {vehicle.color}")

def main():
    # Creamos instancias de vehículos
    car1 = Car("Toyota", "Supra", 2000, "Blanco")
    car2 = Car("Ford", "Mustang", 2022, "Rojo")
    motorcycle1 = Motorcycle("Harley Davidson", "Muscle Vrod", 2021, "Negro")

    # Creamos el inventario de autos
    inventory = CarInventory()

    # Agregamos vehículos al inventario
    inventory.add_vehicle(car1)
    inventory.add_vehicle(car2)
    inventory.add_vehicle(motorcycle1)

    inventory.print_inventory()     #Llamamos al método print_inventory de la instancia inventory

    # Buscamos vehículos por atributo
    print("\nBúsqueda de vehículos por atributo:")
    search_make = inventory.search_by_attribute("make", "Toyota")
    search_color = inventory.search_by_attribute("color", "Rojo")
    search_model = inventory.search_by_attribute("model", "Muscle Vrod")

    # Imprimimos los resultados de la búsqueda
    print("Vehículos encontrados por marca 'Toyota':")
    for vehicle in search_make:
        print(f"{vehicle.get_type()}: {vehicle.make} {vehicle.model} ({vehicle.year}), Color: {vehicle.color}")

    print("\nVehículos encontrados por color 'Rojo':")
    for vehicle in search_color:
        print(f"{vehicle.get_type()}: {vehicle.make} {vehicle.model} ({vehicle.year}), Color: {vehicle.color}")

    print("\nVehículos encontrados por modelo 'Muscle Vrod':")
    for vehicle in search_model:
        print(f"{vehicle.get_type()}: {vehicle.make} {vehicle.model} ({vehicle.year}), Color: {vehicle.color}")

if __name__ == "__main__":
    main()