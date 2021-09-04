package ExercicioPraticoLembrete.src;

public class DataNotificacao {
  int dia, mes;
  int ano;
  String dataFormatada;

  DataNotificacao(int i, int j, int k) {
    this.dia = i;
    this.mes = j;
    this.ano = k;
    this.dataFormatada = Integer.toString(this.dia) + "/" + Integer.toString(this.mes) + "/"
        + Integer.toString(this.ano);
  }

}
