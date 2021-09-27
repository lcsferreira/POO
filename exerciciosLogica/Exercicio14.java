import java.util.Scanner;

public class Exercicio14 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double premiacao = 0, valorPrimeiro = 0, valorSegundo = 0, valorTerceiro = 0;

    System.out.print("Digite o valor da premiação: ");
    premiacao = ler.nextFloat();

    valorPrimeiro = premiacao * 0.46;
    valorSegundo = premiacao * 0.32;
    valorTerceiro = premiacao - valorPrimeiro - valorSegundo;

    System.out.printf("Primeiro lugar: R$%.2f\nSegundo lugar: R$%.2f\nTerceiro lugar: R$%.2f\n", valorPrimeiro,
        valorSegundo, valorTerceiro);

  }
}
