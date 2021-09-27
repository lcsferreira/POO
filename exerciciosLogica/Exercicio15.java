import java.util.Scanner;

public class Exercicio15 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int valor = 0, soma = 0, invertido = 0;

    System.out.print("Digite o valor: ");
    valor = ler.nextInt();
    while (valor > 0) {
      soma = valor % 10;
      invertido = (invertido * 10) + soma;
      valor /= 10;
    }
    System.out.println(invertido);
  }
}
