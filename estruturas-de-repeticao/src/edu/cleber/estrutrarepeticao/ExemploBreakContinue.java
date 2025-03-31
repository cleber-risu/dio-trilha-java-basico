package edu.cleber.estrutrarepeticao;

public class ExemploBreakContinue {
  public static void main(String[] args) {

    // interrompe
    for (int numero = 1; numero <= 5; numero++) {
      if (numero == 3) {
        break;
      }
      System.out.println(numero);
    }

    System.out.println();

    // pula
    for (int numero = 1; numero <= 5; numero++) {
      if (numero == 3) {
        continue;
      }
      System.out.println(numero);
    }
  }
}
