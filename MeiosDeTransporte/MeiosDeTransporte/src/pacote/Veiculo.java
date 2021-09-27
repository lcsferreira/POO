package pacote;

public class Veiculo {
  protected String marca;
  protected int qtdRodas;
  protected String modelo;
  protected int velocidade;

  protected Veiculo(String marca, int qtdRodas, String modelo) {
    this.marca = marca;
    this.qtdRodas = qtdRodas;
    this.modelo = modelo;
    this.velocidade = 0;
  }

  public void imprimirInformacoes() {
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Quantidade de rodas: " + qtdRodas);
    System.out.println("Velocidade: " + velocidade);
  }

}
