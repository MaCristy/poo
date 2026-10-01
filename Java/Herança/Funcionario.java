
public class Funcionario {
    protected String nome; /* diferente do private, no protected as classes filhas também podem acessar */
    protected double salario;
    protected int horasExtras;
    public Funcionario(String nome, double salario, int horasExtras) { /*inicializa os atributos */
        this.nome = nome;
        this.salario = salario;
        this.horasExtras = horasExtras;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Gerente extends Funcionario { /*nessa parte começamos a "criar" a herança */
    private double bonus;

    public Gerente(String nome, double salario, int horasExtras, double bonus) {
        super(nome, salario, horasExtras); /* vai chamar o construtor da classe Funcionario */
        this.bonus = bonus; /* aqui vai adicionar uma característica que é exclusiva do gerente */
    }

    public String getNome() {
        return nome;
    }

    public double getBonus() {
        return bonus;
    }
    
}

class Aplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 2000.0, 10);
        Gerente gerente = new Gerente("Maria", 5000.0, 5, 1000.0);

        System.out.println(funcionario.getNome());
        System.out.println(gerente.getNome());
        System.out.println(gerente.getBonus() + "-" + gerente.getBonus());
    }
}