package edu.cleber.operadores;

public class Concatenacao {
  public static void main(String[] args) {
    // classe Operadores.java
    String nomeCompleto = "LINGUAGEM" + "JAVA";

    // qual o resultado das expressoes abaixo?
    String concatenacao = "?";

    concatenacao = 1 + 1 + 1 + "1";
    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + 1;
    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + "1";
    System.out.println(concatenacao);

    concatenacao = "1" + 1 + 1 + 1;
    System.out.println(concatenacao);

    concatenacao = "1" + (1 + 1 + 1);
    System.out.println(concatenacao);

  }
}
