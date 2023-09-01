class Singleton:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super().__new__(cls)
        return cls._instance

def main():
    singleton1 = Singleton()
    singleton2 = Singleton()

    print(singleton1 is singleton2)  # Debería imprimir True, ya que ambos son la misma instancia

if __name__ == "__main__":
    main()
