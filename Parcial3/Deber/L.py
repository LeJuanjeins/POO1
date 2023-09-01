class Bird:
    def fly(self):
        pass

class Sparrow(Bird):
    def fly(self):
        return "Sparrow is flying"

class Ostrich(Bird):
    def fly(self):
        return "Ostrich can't fly"

def make_bird_fly(bird):
    return bird.fly()

def main():
    sparrow = Sparrow()
    ostrich = Ostrich()

    birds = [sparrow, ostrich]

    for bird in birds:
        print(make_bird_fly(bird))

if __name__ == "__main__":
    main()
