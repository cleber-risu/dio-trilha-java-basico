package edu.cleber.estrutrarepeticao;

public class ExemploForArray {
  public static void main(String[] args) {
    String[] alunos = { "Felipe", "Jonas", "Julia", "Marcos", "Talita" };

    for (int x = 0; x < alunos.length; x++) {
      System.out.println("O aluno do indice x = " + x + " é " + alunos[x]);
    }

    System.out.println();

    // ForEach
    for (String aluno : alunos) {
      System.out.println("O nome do aluno é: " + aluno);
    }
  }
}
