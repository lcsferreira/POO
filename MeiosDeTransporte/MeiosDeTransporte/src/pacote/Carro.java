package pacote;

public class Carro extends Automovel {
  private int qtdPortas;

  public Carro(String marca, String modelo, int qtdRodas, double potenciaDoMotor, int qtdPortas) {
    super(marca, modelo, qtdRodas, potenciaDoMotor);
    this.qtdPortas = qtdPortas;
  }

  public void imprimirInformacoes() {
    super.imprimirInformacoes();
    System.out.println("Número de portas: " + qtdPortas);
  }

}
