from pymongo import MongoClient
class Conexion:
    def __init__(self, bd, coll):
        self.bd = bd
        self.coll = coll
        self.url = "mongodb://localhost:27017/"
        self.cx = None

    def conectar(self):
        try:
            client = MongoClient(self.url)
            self.cx = client[self.bd]
            print("SE CONECTÓ A BD " + self.bd)
        except Exception as e:
            print("NO SE CONECTÓ A BD " + self.bd)
            print(e)

        return self.cx
    
    def get_color_value(self, coll, color):

        client = MongoClient(self.url)
        db = client[self.bd]
        collection = db[coll]
        
        filter = {'colors': color}
        result = collection.find_one(filter)

        if result:
            return result['colorValue']
        else:
            return None

    def get_multiplier_band(self, coll, color):

        client = MongoClient(self.url)
        db = client[self.bd]
        collection = db[coll]
        
        filter = {'colors': color}
        result = collection.find_one(filter)

        if result:
            valor = result['multiplierBand']
            texto = f"{valor:.0e}".replace("+0", "^")
            return texto
        else:
            return None

    def get_tolerance(self, coll, field, color):

        client = MongoClient(self.url)
        db = client[self.bd]
        collection = db[coll]
        
        filter = {field : color}
        result = collection.find_one(filter)

        if result:
            return result['tolerance']
        else:
            return None
        
    def get_contact(self,coll, firstname, lastname, email):
        client = MongoClient(self.url)
        db = client[self.bd]
        collection = db[coll]
        contact = {
            'firstname': firstname,
            'lastname': lastname,
            'email': email
        }
        result = collection.insert_one(contact)
        if result:
            return True
        else:
            return False