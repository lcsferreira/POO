package pacote;

public class CadastroDeVeiculos {
  private static int proxVeiculo = 0;
  private Veiculo[] cadastros;
  private int tamanhoInicial;

  public CadastroDeVeiculos(int tamanhoDaLista) {
    this.tamanhoInicial = tamanhoDaLista;
    this.cadastros = new Veiculo[tamanhoDaLista];
  }

  public void inserir(Veiculo veiculo) {
    int i = 0;
    if (proxVeiculo == cadastros.length) {
      tamanhoInicial *= 2;
      Veiculo[] novaLista = new Veiculo[tamanhoInicial];
      for (Veiculo cadastro : this.cadastros) {
        novaLista[i] = cadastro;
        i++;
      }
      novaLista[proxVeiculo] = veiculo;
      this.cadastros = novaLista;
      proxVeiculo++;
    } else {
      this.cadastros[proxVeiculo] = veiculo;
      proxVeiculo++;
    }
  }

  public Veiculo retornarItem(int posicao) {
    if (posicao <= proxVeiculo) {
      return cadastros[posicao];
    }
    return null;
  }

  public int tamanho() {
    return cadastros.length;
  }

  public void imprimir() {
    for (int i = 0; i < proxVeiculo; i++) {
      cadastros[i].imprimirInformacoes();
      System.out.println("-------");
    }
  }
}
