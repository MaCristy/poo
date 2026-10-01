class Forma:
    def calcular_area(self):
        return 0


class Quadrado(Forma):
    def __init__(self, lado):
        self.lado = lado

    def calcular_area(self):
        return self.lado ** 2


class Circulo(Forma):
    def __init__(self, raio):
        self.raio = raio

    def calcular_area(self):
        return 3.14 * self.raio ** 2


f1 = Quadrado(4)
f2 = Circulo(3)

print(f1.calcular_area())
print(f2.calcular_area())