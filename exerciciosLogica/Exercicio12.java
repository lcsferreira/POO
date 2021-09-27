import java.util.Scanner;

public class Exercicio12 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int x = 0, y = 0;

    System.out.print("Digite um valor: ");
    x = ler.nextInt();
    System.out.print("Digite outro valor: ");
    y = ler.nextInt();

    if (x % y == 0) {
      System.out.println(x + " é múltiplo de " + y);
    } else if (y % x == 0) {
      System.out.println(y + " é múltiplo de " + x);
    } else {
      System.out.println(y + " não é múltiplo de " + x);
    }
  }
}
