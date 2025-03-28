package edu.cleber.metodos.sistemasmarttv;

public class SmartTV {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  public void aumetarVolume() {
    volume++;
  }

  public void diminuirVolume() {
    volume--;
  }

  public void aumentarCanal() {
    canal++;
  }

  public void diminuirCanal() {
    canal--;
  }

  public void mudarDeCanal(int novoCanal) {
    canal = novoCanal;
  }
}
