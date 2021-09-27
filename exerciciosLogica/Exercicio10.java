import java.util.Scanner;

public class Exercicio10 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int a = 0, b = 0, i, resultado = 1;
    System.out.print("Digite a base: ");
    a = ler.nextInt();
    System.out.print("Digite a potência: ");
    b = ler.nextInt();
    for (i = 0; i < b; i++) {
      resultado *= a;
    }

    System.out.println(resultado);
  }
}
