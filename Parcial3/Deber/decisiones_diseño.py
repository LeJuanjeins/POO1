class PricingCalculator:
    def __init__(self, discount_strategy, tax_strategy):
        self.discount_strategy = discount_strategy
        self.tax_strategy = tax_strategy

    def calculate_total_price(self, items):
        subtotal = sum(item.price for item in items)
        discount = self.discount_strategy.calculate_discount(subtotal)
        taxed_total = self.tax_strategy.apply_tax(subtotal - discount)
        return taxed_total

class DiscountStrategy:
    def calculate_discount(self, amount):
        pass

class FlatDiscount(DiscountStrategy):
    def __init__(self, discount_amount):
        self.discount_amount = discount_amount

    def calculate_discount(self, amount):
        return self.discount_amount

class TaxStrategy:
    def apply_tax(self, amount):
        pass

class LocalTax(TaxStrategy):
    def __init__(self, tax_rate):
        self.tax_rate = tax_rate

    def apply_tax(self, amount):
        return amount * (1 + self.tax_rate)

def main():
    items = [
        Item("Product 1", 100),
        Item("Product 2", 50),
        Item("Product 3", 75)
    ]

    discount_strategy = FlatDiscount(20)
    tax_strategy = LocalTax(0.08)

    calculator = PricingCalculator(discount_strategy, tax_strategy)
    total_price = calculator.calculate_total_price(items)

    print("Total Price:", total_price)

class Item:
    def __init__(self, name, price):
        self.name = name
        self.price = price

if __name__ == "__main__":
    main()
