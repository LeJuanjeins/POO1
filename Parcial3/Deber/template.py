from abc import ABC, abstractmethod

class AbstractClass(ABC):
    def template_method(self):
        self.common_step_1()
        self.custom_step_2()
        self.common_step_3()

    def common_step_1(self):
        print("AbstractClass: Common Step 1")

    @abstractmethod
    def custom_step_2(self):
        pass

    def common_step_3(self):
        print("AbstractClass: Common Step 3")

class ConcreteClassA(AbstractClass):
    def custom_step_2(self):
        print("ConcreteClassA: Custom Step 2")

class ConcreteClassB(AbstractClass):
    def custom_step_2(self):
        print("ConcreteClassB: Custom Step 2")

def main():
    concrete_a = ConcreteClassA()
    concrete_a.template_method()

    print()

    concrete_b = ConcreteClassB()
    concrete_b.template_method()

if __name__ == "__main__":
    main()
