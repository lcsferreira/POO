import java.util.Scanner;

public class Exercicio8 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int valor = 0, valMax = 0, valMin = 0, i;
    float media = 0;

    for (i = 0; i < 5; i++) {
      System.out.print("Digite um valor: ");
      valor = ler.nextInt();
      media += valor;
      if (i == 0) {
        valMax = valor;
        valMin = valor;
      }
      if (valor > valMax) {
        valMax = valor;
      } else if (valor < valMin) {
        valMin = valor;
      }
    }

    media = (float) valor / 5;

    System.out.println("valor máximo: " + valMax);
    System.out.println("valor mínimo: " + valMin);
    System.out.printf("a média é:%.2f", media);

  }
}