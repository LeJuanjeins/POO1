class Auto:
    def __init__(self, marca, modelo, anio, color):
        self.marca = marca
        self.modelo = modelo
        self.anio = anio
        self.color = color

    def arrancar(self):
        print(f"El auto {self.marca} {self.modelo} ha arrancado.")

    def detener(self):
        print(f"El auto {self.marca} {self.modelo} se ha detenido.")

    def cambiar_color(self, nuevo_color):
        if nuevo_color != self.color:
            self.color = nuevo_color
            print(f"El auto {self.marca} {self.modelo} ha cambiado de color a {self.color}.")
        else:
            print(f"El auto {self.marca} {self.modelo} ya es de color {self.color}.")

# Crear un objeto de la clase Auto
mi_auto = Auto("Toyota", "Corolla", 2022, "rojo")

# Llamar a los métodos del objeto
mi_auto.arrancar()
mi_auto.cambiar_color("azul")
mi_auto.detener()