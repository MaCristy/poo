# estava dando erro, então pedi ajuda ao chat e ele me informou que isso poderia ajudar, pois o abc é meio que o suporte oficial do python para abstração

from abc import ABC, abstractmethod 
            # transforma em abstrata |  cria os metodos obrigatorios
class Livraria(ABC):
    def __init__(self, titulo, autor, ano_publicacao):
        self.titulo = titulo
        self.autor = autor
        self.ano_publicacao = ano_publicacao
        # o self é a mesma coisa que o this do java
    @abstractmethod # aparece para obrigar a implementar o metodo na classe filha
    def exibir_informacoes(self):
        pass # um caso interessante, esse pass não faz "nada" é apenas um espaço resevado 

# não tem extends, então a classe pai esta entre parenteses
class Livro(Livraria):
    def exibir_informacoes(self): #sobreecrevendo o metodo
        print(f"Título: {self.titulo}")
        print(f"Autor: {self.autor}")
        print(f"Ano: {self.ano_publicacao}")


livro = Livro( # como não existe o new é chamado como uma função
    "O Pequeno Príncipe",
    "Antoine de Saint-Exupéry",
    1943
)

livro.exibir_informacoes()