class Conta { // crindo a classe
  #saldo; 
  // isso foi outra coisa que descobri, no js os atributos privado vão ter o # na frente

  constructor(saldo) {
    this.#saldo = saldo;
  }

  depositar(valor) { // recebendo valor e depois atualiza
    this.#saldo += valor;
  }

  getSaldo() {
    return this.#saldo;
  } // saldo protegido
}

const c = new Conta(100);
c.depositar(50);
console.log(c.getSaldo());