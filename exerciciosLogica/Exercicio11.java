import java.util.Scanner;

public class Exercicio11 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int a = 0, b = 0, diferenca;

    System.out.print("Digite o primeiro valor: ");
    a = ler.nextInt();
    System.out.print("Digite o segundo valor: ");
    b = ler.nextInt();

    if (a > b) {
      diferenca = a - b;
    } else {
      diferenca = b - a;
    }

    System.out.println(diferenca);
  }
}
