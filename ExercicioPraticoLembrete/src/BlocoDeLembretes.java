package ExercicioPraticoLembrete.src;

public class BlocoDeLembretes {
  private int posicao = 0;
  int maximoLembretes = 10;
  String nomeLista;
  Lembrete[] lembretes;

  BlocoDeLembretes(String nome) {
    this.nomeLista = nome;
    this.lembretes = new Lembrete[maximoLembretes];
  }

  void incluirLembrete(Lembrete novoLembrete) {
    int i = 0;
    if (posicao == maximoLembretes) {
      maximoLembretes *= 2;
      Lembrete[] novaLista = new Lembrete[maximoLembretes];
      for (Lembrete lembrete : this.lembretes) {
        novaLista[i] = lembrete;
        i++;
      }
      novaLista[posicao] = novoLembrete;
      this.lembretes = novaLista;
      posicao++;
    } else {
      this.lembretes[posicao] = novoLembrete;
      posicao++;
    }
  }

  int numeroDeLembretes() {
    int contador = 0;
    for (int i = 0; i < this.lembretes.length; i++) {
      if (this.lembretes[i] != null) {
        contador++;
      }
    }
    return contador;
  }

  void removerLembrete(int index) {
    if (this.numeroDeLembretes() == 0) {
      System.out.println("Lista vazia!!");
    } else {
      for (int i = index; i < maximoLembretes; i++) {
        if (this.lembretes[i] == null) {
          break;
        }
        this.lembretes[i] = this.lembretes[i + 1];
      }
      posicao--;
    }
  }

  void listarLembretes() {
    if (this.numeroDeLembretes() == 0) {
      System.out.println("Lista vazia!!");
    } else {
      for (int i = 0; i < this.numeroDeLembretes(); i++) {
        this.lembretes[i].infoLembrete();
        System.out.println("------");
      }
    }
  }

  void buscarLembretesPorData(DataNotificacao dataBusca) {
    int find = 0;
    if (this.numeroDeLembretes() == 0) {
      System.out.println("Lista vazia!!");
    } else {
      System.out.println("Lembretes nessa data: ");
      for (int i = 0; i < this.numeroDeLembretes(); i++) {
        if (this.lembretes[i].dataNotificacao.dia == dataBusca.dia
            && this.lembretes[i].dataNotificacao.mes == dataBusca.mes
            && this.lembretes[i].dataNotificacao.ano == dataBusca.ano) {
          this.lembretes[i].infoLembrete();
          System.out.println("-------");
          find = 1;
        }
      }
      if (find == 0) {
        System.out.println("Não há lembretes nesta data!");
      }
    }
  }

  void buscarLembretesPorNome(String nomeBuscar) {
    int find = 0;
    if (this.numeroDeLembretes() == 0) {
      System.out.println("Lista vazia!!");
    } else {
      System.out.println("Lembretes com esse nome: ");
      for (int i = 0; i < this.numeroDeLembretes(); i++) {
        if (this.lembretes[i].nomeLembrete.indexOf(nomeBuscar) >= 0) {
          this.lembretes[i].infoLembrete();
          System.out.println("-------");
          find = 1;
        }
      }
      if (find == 0) {
        System.out.println("Não há lembretes com esse nome!!");
      }
    }
  }
}
