class Persona:
    #Cada que se cree un objeto se utilizara el metodo
    def __init__(self, nombre):#en la variable self se guarda la referencia al objeto creado
        self.nombre = nombre #Asigna nombre al atributo
    
    def saludar(self):
        print(f"Hola, soy {self.nombre}.")
        #ATRIBUTOS COMO: marca,modelo,color

# Crear objetos de la clase Persona
juan = Persona("Juan")
maria = Persona("Maria")
# Llamar al método del objeto
juan.saludar()
maria.saludar()
