// O js não tem suporte para classes abstratas, por isso simulamos com o throw new Error

class Livraria {
  constructor(titulo, autor, anoPublicacao) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
  }

  exibirInformacoes() {
    throw new Error("Este método deve ser implementado.");
    // se o metodo não for implementado na classe filha, ele vai mostra essa mensagem como erro
  }
}

class Livro extends Livraria {
  exibirInformacoes() { // como não temos o override, criamos um metodo com o mesmo nome, que vai sobrescrever o metodo da classe pai
    console.log(`Título: ${this.titulo}`);
    console.log(`Autor: ${this.autor}`);
    console.log(`Ano: ${this.anoPublicacao}`);
  }
}

const livro = new Livro(
  "O Pequeno Príncipe",
  "Antoine de Saint-Exupéry",
  1943
);

livro.exibirInformacoes(); // execulta a classe livro