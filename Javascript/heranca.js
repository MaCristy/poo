class Funcionario {
  constructor(nome, salario, horasExtras) {
    this.nome = nome;
    this.salario = salario;
    this.horasExtras = horasExtras;
  }

  getNome() {
    return this.nome;
  }

  setNome(nome) {
    this.nome = nome;
  }
}

class Gerente extends Funcionario {
  constructor(nome, salario, horasExtras, bonus) {
    super(nome, salario, horasExtras);
    this.bonus = bonus;
  }

  getBonus() {
    return this.bonus;
  }
}

const funcionario = new Funcionario("João", 2000, 10);
const gerente = new Gerente("Maria", 5000, 5, 1000);

console.log(funcionario.getNome());
console.log(gerente.getNome());
console.log(gerente.getBonus());