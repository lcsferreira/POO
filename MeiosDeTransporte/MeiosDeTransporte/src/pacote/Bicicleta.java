package pacote;

public class Bicicleta extends Veiculo {
  private int numMarchas;
  private boolean bagageiro;

  public Bicicleta(String marca, String modelo, int qtdRodas, int numMarchas, boolean bagageiro) {
    super(marca, qtdRodas, modelo);
    this.numMarchas = numMarchas;
    this.bagageiro = bagageiro;
  }

  public void imprimirInformacoes() {
    super.imprimirInformacoes();
    System.out.println("Número de marchas: " + numMarchas);
    System.out.println("Possui bagageiro? " + bagageiro);
  }

}
