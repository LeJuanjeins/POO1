class CreditCardPayment:
    def process_payment(self, amount):
        return f"Credit card payment processed for ${amount}"

class PayPalPayment:
    def process_payment(self, amount):
        return f"PayPal payment processed for ${amount}"

class PaymentProcessor:
    def __init__(self, payment_method):
        self.payment_method = payment_method

    def process(self, amount):
        return self.payment_method.process_payment(amount)

def main():
    credit_card_payment = CreditCardPayment()
    paypal_payment = PayPalPayment()

    credit_card_processor = PaymentProcessor(credit_card_payment)
    paypal_processor = PaymentProcessor(paypal_payment)

    amount = 100

    print("Credit Card:", credit_card_processor.process(amount))
    print("PayPal:", paypal_processor.process(amount))

if __name__ == "__main__":
    main()
