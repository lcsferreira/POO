import java.util.Scanner;

public class Exercicio9 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int tempoTotal = 0, horas = 0, minutos = 0;

    System.out.print("Digite o tmepo do atleta: ");
    tempoTotal = ler.nextInt();

    horas = (int) (tempoTotal / 60);
    minutos = (tempoTotal % 60);

    System.out.println("tempo: " + horas + "h:" + minutos + "min");
  }
}
