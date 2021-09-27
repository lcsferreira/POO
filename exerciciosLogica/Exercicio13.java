import java.util.Scanner;

public class Exercicio13 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int i;
    float media = 0, nota = 0;

    for (i = 0; i < 3; i++) {
      System.out.print("Digite uma nota: ");
      nota = ler.nextFloat();
      media += nota;
    }
    media = media / 3;
    if (media >= 7) {
      System.out.println("media: " + media + " Aprovado!");
    } else {
      System.out.println("media: " + media + " Reprovado!");
    }
  }
}
