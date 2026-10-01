class Forma {
  calcularArea() { // assim como no java, ele ta aqui apenas para servir de referencia
    return 0;
  }
}

class Quadrado extends Forma {
  constructor(lado) {
    super();
    this.lado = lado;
  }

  calcularArea() {
    return this.lado * this.lado;
  }
}

class Circulo extends Forma {
  constructor(raio) {
    super();
    this.raio = raio;
  }

  calcularArea() {
    return 3.14 * this.raio * this.raio;
  }
}

const f1 = new Quadrado(4);
const f2 = new Circulo(3);

console.log(f1.calcularArea());
console.log(f2.calcularArea());