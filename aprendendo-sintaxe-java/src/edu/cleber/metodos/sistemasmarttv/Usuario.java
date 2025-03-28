package edu.cleber.metodos.sistemasmarttv;

public class Usuario {
  public static void main(String[] args) {

    SmartTV smartTV = new SmartTV();

    System.out.println("TV ligada :" + smartTV.ligada);
    System.out.println("Cana atual:" + smartTV.canal);
    System.out.println("Volume atual" + smartTV.volume);

    smartTV.ligar();
    System.out.println("Novo estatus, TV ligada :" + smartTV.ligada);

    smartTV.mudarDeCanal(13);
    System.out.println("Canal atual: " + smartTV.canal);

    smartTV.diminuirVolume();
    smartTV.diminuirVolume();
    smartTV.diminuirVolume();
    smartTV.aumetarVolume();
    System.out.println("Volume atual: " + smartTV.volume);

    smartTV.desligar();
    System.out.println("Novo estatus, TV ligada: " + smartTV.ligada);
  }
}
