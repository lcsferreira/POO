import java.util.Scanner;

public class Exercicio19 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int numero = 0, soma = 0, maxValor = 0, minValor = 0, cont = 0, contPares = 0;
    float media = 0, percPositivos = 0, percNegativos = 0, mediaPares = 0;
    while (numero != -1) {
      System.out.print("Digite um número: ");
      numero = ler.nextInt();
      if (cont == 0) {
        maxValor = numero;
        minValor = numero;
      } else if (maxValor < numero) {
        maxValor = numero;
      } else if (minValor > numero) {
        minValor = numero;
      }
      cont++;
      soma += numero;
      if (numero % 2 == 0) {
        mediaPares += numero;
        contPares++;
      }
      if (numero >= 0) {
        percPositivos++;
      } else {
        percNegativos++;
      }
    }
    mediaPares = mediaPares / contPares;
    media = soma / cont;
    percPositivos = (percPositivos / cont) * 100;
    percNegativos = (percNegativos / cont) * 100;

    System.out.println("soma dos números: " + soma);
    System.out.println("quantidade de numeros digitados: " + cont);
    System.out.println("media: " + media);
    System.out.println("percentual números positivos: " + percPositivos + "%");
    System.out.println("percentual números negativos: " + percNegativos + "%");
    System.out.println("maior valor digitado: " + maxValor);
    System.out.println("menor valor digitado: " + minValor);
    System.out.println("media dos números pares: " + mediaPares);
  }
}
