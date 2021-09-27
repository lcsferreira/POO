package pacote;

public class Moto extends Automovel {
  private boolean partidaEletrica;

  public Moto(String marca, String modelo, int qtdRodas, int potenciaDoMotor, boolean partidaEletrica) {
    super(marca, modelo, qtdRodas, potenciaDoMotor);
    this.partidaEletrica = partidaEletrica;
  }

  public void imprimirInformacoes() {
    super.imprimirInformacoes();
    System.out.println("Partida elétrica? " + partidaEletrica);
  }
}
