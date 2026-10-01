
public abstract class Livraria {  /* o abstract faz com que Livraria seja uma classe abstrata, logo ela não poderá vim a ser instanciada */
                /*Atributos abaixo */
    String titulo;
    String autor;
    int anoPublicacao;

    public Livraria(String titulo, String autor, int anoPublicacao) { /* construtor que fica responsavel por receber os valores das classes filhas */
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    } /* o this é meio que o proprio objeto, então ele vai copiar os parametros para os atributos da classe */

    public abstract void exibirInformacoes(); /* é um tipo de assinaturo do metodo, sendo obrigatorio estar na clases filhas */
}

class Livro extends Livraria {

    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao); /* chama o construtor da classe abstrata para preencher os atributos */
    }

    @Override /*ta indicando que o metodo abstrato foi implementado(sobrescrito) */
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoPublicacao);
    }
    public static void main(String[] args) { /* executamos o método aqui */

        Livro livro = new Livro(
            "O Pequeno Príncipe",
            "Antoine de Saint-Exupéry",
            1943
        );
        
        livro.exibirInformacoes();  /*auto explicativo, mas ta apenas exibindo os dados do objeto */

    }
}