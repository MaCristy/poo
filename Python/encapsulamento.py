class Conta:
    def __init__(self, saldo): # nosso construtor
        self.__saldo = saldo
                    # esse __ é o encapsulamento de fato, isso torna o atributo privado
    def depositar(self, valor):
        self.__saldo += valor  # no obvio ele recebe um deposito e atualiza o saldo

    def get_saldo(self):
        return self.__saldo # retornando o saldo protegido
                    
c = Conta(100)
c.depositar(50)
print(c.get_saldo())