package edu.cleber.escopo;

public class Conta {
  // variavel da classe conta
  double saldo = 10.0;

  public void sacar(double valor) {
    // variavel local de método
    double novoSaldo = saldo - valor;
  }

  public void imprimirSaldo() {
    // disponivel em toda classe
    System.out.println(saldo);

    // somente o metodo sacar conhece esta variavel
    // System.out.println(novoSaldo);
  }

  public double calcularDividaExponencial() {
    // variavel local de método
    double valorParcela = 50.0;
    double valorMontante = 0.0;

    for (int x = 1; x <= 5; x++) { // variavel de escopo de fluxo
      // esta variavel sera reiniciada a cada execução for
      double valorCalculado = valorParcela * x;
    }
    // escopo de fluxo
    // x e valorCalculado nunca estarão disponiveis fora do for

    return valorMontante;
  }
}
