public class Conta {
    private double saldo; /* atributo privado, só pode ser acessado pela própria classe */

    public Conta(double saldo) { /*é o nosso construtor */
        this.saldo = saldo;
        /*atributo da classe | parametro */
    }

    public void depositar(double valor) { /* meio que controla as alteração do saldo */
        saldo += valor; /* soma o depositado ao saldo atual */
    }

    public double getSaldo() { /* aqui é onde ele vai acessar o atributo privado */
        return saldo;
    }

    public static void main(String[] args) {
        Conta c = new Conta(100); /* ta criando uma conta com 100 de saldo, e ele ali em baixo deposita 50, logo vai fica 150 */
        c.depositar(50);
        System.out.println(c.getSaldo());
    }
}
