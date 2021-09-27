import java.util.Scanner;

public class Exercicio17 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int numero = 0;

    System.out.print("Digite um número: ");
    numero = ler.nextInt();

    if (numero % 3 == 0 && numero % 5 == 0) {
      System.out.println("é divisivel por 3 e 5!!");
    } else if (numero % 3 == 0 || numero % 5 == 0) {
      System.out.println("é divisivel por 3 ou 5!!");
    } else {
      System.out.println("não é divisivel por 3 ou por 5!!");
    }
  }
}
