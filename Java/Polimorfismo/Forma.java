
public class Forma {
    public double calcularArea() { /* existe apenas para representar que deve ter uma forma de calcular a área */
        return 0;
    }
}

class Quadrado extends Forma {
    private double lado;  /* atributo específico do quadrado*/

    public Quadrado(double lado) { /*construtor */
        this.lado = lado;
    }

    @Override /*subistituir o metodo que foi herdado de forma */
    public double calcularArea() {
        return lado * lado;
    }
}

class Retangulo extends Forma {
    private double lado;  /* atributo específico do quadrado*/
    private double altura;

    public Retangulo(double lado, double altura) { /*construtor */
        this.lado = lado;
        this.altura = altura;
    }

    @Override /*subistituir o metodo que foi herdado de forma */
    public double calcularArea() {
        return lado * altura;
    }
}

class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * raio * raio;
    }
}

class Aplicacao {
    public static void main(String[] args) {
        Forma f1 = new Quadrado(4);
        /* a variável f1 e f2 são do tipo Forma, mas armazenam objetos dos tipos Quadrado e Circulo, respectivamente */
        Forma f2 = new Circulo(3);

        Forma f3 = new Retangulo(4, 5);

        System.out.println(f1.calcularArea()); /* chama o método sobrescrito da classe Quadrado */
        System.out.println(f2.calcularArea()); /* chama o método sobrescrito da classe Circulo */
        System.out.println(f3.calcularArea()); /* chama o método sobrescrito da classe Retangulo */
    }
}