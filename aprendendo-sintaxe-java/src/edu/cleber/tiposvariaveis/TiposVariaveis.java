package edu.cleber.tiposvariaveis;

public class TiposVariaveis {
  public static void main(String[] args) {
    
    // TIPOS DE DADOS

    // (1 byte) -128 a 127
    byte idade = 123;
    
    // (2 byte) -32768 a 32767 
    short ano = 2025;
    
    // (4 bytes) -2.147.483.648 a 2.147.483.647
    int cep = 21070333;
    
    // (8 bytes) -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
    long cpf = 98765432109L;
    
    // DECLARACAO DE VARIAVEIS

    int idade2; //Tipo "int", nome "idade", com nenhum valor atribuído. 
    int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
    double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.


    // CONTANTES

    int numero = 5;
    numero = 10;
    final double VALOR_DE_PI = 3.14; // constantes tem que iniciar com final e seu nome em caixa alta
  }
}
