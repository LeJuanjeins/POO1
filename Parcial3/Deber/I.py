from abc import ABC, abstractmethod

# Interfaz para trabajadores que realizan tareas manuales
class ManualWorker(ABC):
    @abstractmethod
    def do_manual_work(self):
        pass

# Interfaz para trabajadores que utilizan computadoras
class ComputerWorker(ABC):
    @abstractmethod
    def do_computer_work(self):
        pass

# Implementación de un trabajador manual
class ConstructionWorker(ManualWorker):
    def do_manual_work(self):
        return "Construction worker is building"

# Implementación de un trabajador de oficina
class Programmer(ComputerWorker):
    def do_computer_work(self):
        return "Programmer is coding"

# Implementación de un trabajador que realiza ambas tareas
class HybridWorker(ManualWorker, ComputerWorker):
    def do_manual_work(self):
        return "Hybrid worker is doing manual work"

    def do_computer_work(self):
        return "Hybrid worker is doing computer work"

def main():
    construction_worker = ConstructionWorker()
    programmer = Programmer()
    hybrid_worker = HybridWorker()

    workers = [construction_worker, programmer, hybrid_worker]

    for worker in workers:
        if isinstance(worker, ManualWorker):
            print(worker.do_manual_work())
        if isinstance(worker, ComputerWorker):
            print(worker.do_computer_work())

if __name__ == "__main__":
    main()
