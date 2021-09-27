package pacote;

public class Automovel extends Veiculo {
  protected double potenciaDoMotor;

  protected Automovel(String marca, String modelo, int qtdRodas, double potenciaDoMotor) {
    super(marca, qtdRodas, modelo);
    this.potenciaDoMotor = potenciaDoMotor;
  }

  public void imprimirInformacoes() {
    super.imprimirInformacoes();
    System.out.println("Potência: " + potenciaDoMotor);
  }

}
