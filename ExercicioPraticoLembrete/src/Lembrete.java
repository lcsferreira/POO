package ExercicioPraticoLembrete.src;

public class Lembrete {
  DataNotificacao dataNotificacao;
  String nomeLembrete;
  String descricao;

  Lembrete(DataNotificacao data, String nome, String descricao) {
    this.dataNotificacao = data;
    this.nomeLembrete = nome;
    this.descricao = descricao;
  }

  void infoLembrete() {
    System.out.println(this.nomeLembrete);
    System.out.println(this.descricao);
    System.out.println(this.dataNotificacao.dataFormatada);
  }
}
