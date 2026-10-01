class Funcionario:
    def __init__(self, nome, salario, horas_extras):
        self.nome = nome
        self.salario = salario
        self.horas_extras = horas_extras

    def get_nome(self):
        return self.nome

    def set_nome(self, nome):
        self.nome = nome

# como não tem extends, vai entre parenteses
class Gerente(Funcionario):
    def __init__(self, nome, salario, horas_extras, bonus):
        super().__init__(nome, salario, horas_extras)
        # funciona do mesmo jeito que o super, mas é mais explícito
        self.bonus = bonus

    def get_bonus(self):
        return self.bonus


funcionario = Funcionario("João", 2000, 10)
gerente = Gerente("Maria", 5000, 5, 1000)

print(funcionario.get_nome())
print(gerente.get_nome())
print(gerente.get_bonus())