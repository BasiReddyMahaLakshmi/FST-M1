class Car:

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " is moving")

    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped")


car1 = Car("Maruti", "Jimny", "2019", "5-speed Manual", "Red")
car2 = Car("BMW", "X5", "2018", "4-speed Manual", "White")
car3 = Car("Honda", "City", "2015", "Manual", "Black")

car1.accelerate()
car1.stop()
