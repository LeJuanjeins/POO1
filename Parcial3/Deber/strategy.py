from abc import ABC, abstractmethod

# Interfaz para la estrategia
class PaymentStrategy(ABC):
    @abstractmethod
    def pay(self, amount):
        pass

# Implementación de estrategia de pago con tarjeta de crédito
class CreditCardPayment(PaymentStrategy):
    def pay(self, amount):
        print(f"Paying ${amount} with credit card")

# Implementación de estrategia de pago con PayPal
class PayPalPayment(PaymentStrategy):
    def pay(self, amount):
        print(f"Paying ${amount} with PayPal")

# Contexto que utiliza la estrategia
class PaymentContext:
    def __init__(self, strategy):
        self.strategy = strategy

    def perform_payment(self, amount):
        self.strategy.pay(amount)

def main():
    credit_card_strategy = CreditCardPayment()
    paypal_strategy = PayPalPayment()

    context = PaymentContext(credit_card_strategy)
    context.perform_payment(100)

    context.strategy = paypal_strategy
    context.perform_payment(50)

if __name__ == "__main__":
    main()
