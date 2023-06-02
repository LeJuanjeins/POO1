#   Programa: appAdopcion
#   Nombre: Juan Jose Sanchez
#   Fecha: 14/05/2023

class Mascota:
    def __init__(self, nombre, edad, raza, peso):
        self.nombre = nombre
        self.edad = edad
        self.raza = raza
        self.peso = peso
        self.adoptado = False

    def adoptar(self):
        self.adoptado = True

    def __str__(self):
        estado_adopcion = "Adoptado" if self.adoptado else "Disponible"
        return f"Nombre: {self.nombre}\nEdad: {self.edad}\nRaza: {self.raza}\nEstado: {estado_adopcion}"
class Perro(Mascota):
    def __init__(self, nombre, edad, raza, peso, ladrido):
        super().__init__(nombre, edad, raza, peso)
        self.ladrido = ladrido

    def bark(self):
        print(self.ladrido)

class Gato(Mascota):
    def __init__(self, nombre, edad, raza, peso, maullido):
        super().__init__(nombre, edad, raza, peso)
        self.maullido = maullido

    def meow(self):
        print(self.maullido)

class Adoptante:
    def __init__(self, nombre, direccion):
        self.nombre = nombre
        self.direccion = direccion
        self.mascotas_adoptadas = []

    def adoptar_mascota(self, mascota):
        mascota.adoptar()
        self.mascotas_adoptadas.append(mascota)

    def mostrar_mascotas_adoptadas(self):
        if self.mascotas_adoptadas:
            print("Mascotas adoptadas:")
            for mascota in self.mascotas_adoptadas:
                print(mascota)
                print("-------------")
        else:
            print("No ha adoptado ninguna mascota.")

if __name__ == "__main__":
    # Crear mascotas
    mascota1 = Perro("Kenai", 3, "Border collie", "28kg", "silencioso")
    mascota2 = Gato("Nala", 2, "Munchkin", "13kg", "tenue y dulce")

    # Crear adoptantes
    adoptante1 = Adoptante("Juan", "Calle Principal 123")
    adoptante2 = Adoptante("María", "Avenida Central 456")

    # Mostrar mascotas antes de la adopción
    print("Mascotas disponibles:")
    print(mascota1)
    print("-------------")
    print(mascota2)
    print("-------------")

    # Juan adopta a Kenai
    adoptante1.adoptar_mascota(mascota1)

    # Jose adopta a Nala
    adoptante2.adoptar_mascota(mascota2)

    # Mostrar mascotas después de la adopción
    adoptante1.mostrar_mascotas_adoptadas()
    adoptante2.mostrar_mascotas_adoptadas()