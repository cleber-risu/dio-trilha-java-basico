package edu.cleber.controledefluxo;

public class PlanoOperadora {
  public static void main(String[] args) {
    char plano = 'M';

    // if (plano == 'B') {
    // System.out.println("100 minutos de ligação");
    // } else if (plano == 'M') {
    // System.out.println("100 minutos de ligação");
    // System.out.println("Whats e Instagram Grátis");
    // } else if (plano == 'T') {
    // System.out.println("100 minutos de ligação");
    // System.out.println("Whats e Instagram Grátis");
    // System.out.println("5GB Youtube");
    // }

    switch (plano) {
      case 'T':
        System.out.println("5GB Youtube");
      case 'M':
        System.out.println("100 minutos de ligação");
        break;
      case 'B':
        System.out.println("100 minutos de ligação");
    }
  }
}
