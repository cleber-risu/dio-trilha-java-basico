package edu.cleber.metodos;

public class Metodos {
  public double somar(int num1, int num2) {
    // LOGICA - FINALIDADE DO MÉTODO
    return num1 + num2;
  }

  public void imprimir(String texto) {
    // LOGICA - FINALIDADE DO MÉTODO
    // AQUI NÃO PRECISA DO RETURN
    // POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
  }

  // throws Exception : indica que o método ao ser utilizado
  // poderá gerar uma exceção
  public double dividir(int dividendo, int divisor) throws Exception {
    return dividendo / divisor;
  }

  // este método não pode ser visto por outras classes no projeto
  private void metodoPrivado() {
  }

  // alguns equívocos estruturais
  public void validar() {
    // este método deveria retornar algum valor
    // no caso boolean (true ou false)
  }

  public void calcularEnviar() {
    // um método deve representar uma única responsabilidade
    System.out.println("Não retorna nada");
  }

  public void gravarCliente(String nome, String cpf, Integer telefone) {
    // este método tem a finalidade de gravar
    // informações de um cliente, por que não criar
    // um objeto cliente e passar como parâmetro ?
    // veja abaixo
  }

  // public void gravarCliente(Cliente cliente) {
  // }

  // // ou
  // public void gravar(Cliente cliente) {
  // }
}
