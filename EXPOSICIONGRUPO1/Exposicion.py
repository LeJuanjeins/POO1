class Vehiculo:
    def __init__(self, marca, modelo):      #cualquier comentario en python se hace con el numeral
        self.marca = marca                  #estructura creaccion clase
        self.modelo = modelo                #cuerpo de la clase

    def conducir(self):
        print("Conduciendo el vehículo")    #creacion metodos, estos pueden ser heredados

    def mostrarInformacion(self):
        print("Marca: " + self.marca)
        print("Modelo: " + self.modelo)

class Automovil(Vehiculo):                              #creacion subclase - herencia
    def __init__(self, marca, modelo, numeroPuertas):
        super().__init__(marca, modelo)                 #herencia de atributos
        self.numeroPuertas = numeroPuertas
    def abrirPuertas(self):
        print("Abriendo las " + str(self.numeroPuertas) + " puertas del automóvil")

class Motocicleta(Vehiculo):
    def __init__(self, marca, modelo, tipo):
        super().__init__(marca, modelo)
        self.tipo = tipo
    def realizarAcrobacias(self):
        print("Realizando acrobacias en la motocicleta",motocicleta.modelo)

import sys                                         #libreria permite agregar o quitar elementos
def crearAutomovil():
    print("Ingrese la marca del automóvil: ", end="")       #end= es un salto de linea
    marca = input()                                         #ingreso por telcado de datos
    print("Ingrese el modelo del automóvil: ", end="")
    modelo = input()
    print("Ingrese el número de puertas del automóvil: ", end="")
    numeroPuertas = int(input())
    global automovil                                        #declaramos variable global antes
    automovil = Automovil(marca, modelo, numeroPuertas)

def crearMotocicleta():
    print("Ingrese la marca de la motocicleta: ", end="")
    marca = input()
    print("Ingrese el modelo de la motocicleta: ", end="")
    modelo = input()
    print("Ingrese el tipo de motocicleta (deportiva, scooter, etc.): ", end="")
    tipo = input()
    global motocicleta
    motocicleta = Motocicleta(marca, modelo, tipo)

opcion = 0
while opcion != 3:                                              #menu de ingreso de datos
    print("----- MENU -----")
    print("1. Crear automóvil")
    print("2. Crear motocicleta")
    print("3. Salir")
    opcion = int(input("Ingrese la opción deseada: "))
    if opcion == 1:                                     #llamado de metodos para correr el programa
        crearAutomovil()
        automovil.mostrarInformacion()
        automovil.conducir()
        automovil.abrirPuertas()
    elif opcion == 2:                                            #elif sentencia que revisa
        crearMotocicleta()                                       #multiples sentencias
        motocicleta.mostrarInformacion()
        motocicleta.conducir()
        motocicleta.realizarAcrobacias()
    elif opcion == 3:
        print("¡Hasta luego!")
    else:
        print("Opción inválida. Intente nuevamente.")