import java.util.Scanner;

public class Exercicio18 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    float distancia = 0, qtdGasol = 0, consumo = 0;

    System.out.print("Digite a distância percorrida: ");
    distancia = ler.nextFloat();
    System.out.print("Digite o consumo da gasolina: ");
    qtdGasol = ler.nextFloat();

    consumo = distancia / qtdGasol;
    System.out.println("Consumo: " + consumo);

    if (consumo < 8) {
      System.out.println("Venda o carro!");
    } else if (consumo >= 8 && consumo <= 14) {
      System.out.println("Econômico!");
    } else {
      System.out.println("Super econômico!");
    }
  }
}
