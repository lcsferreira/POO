import java.util.Scanner;

public class Exercicio16 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int ano = 0;

    System.out.print("Digite o ano: ");
    ano = ler.nextInt();

    if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
      System.out.println("Ano bisexto!!");
    } else {
      System.out.println("Não é ano bisexto!!");
    }
  }
}
