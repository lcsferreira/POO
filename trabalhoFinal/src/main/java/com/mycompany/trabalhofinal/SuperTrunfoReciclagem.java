/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhofinal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lucas.ferreira
 */
public class SuperTrunfoReciclagem {

    private final Jogador[] jogadores;
    private final Baralho baralho;
    private final ArrayList<Carta> mesa; //na jogada os jogadores colocam as cartas na mesa
    private final ArrayList<Carta> pilha;//em caso de empate as cartas vão para a pilha

    public SuperTrunfoReciclagem() {
        jogadores = new Jogador[2];
        baralho = new Baralho();
        mesa = new ArrayList<>();
        pilha = new ArrayList<>();
    }

    //criar os jogadores
    private void criarJogadores() {
        Scanner input = new Scanner(System.in);
        String nome;
        //jogadores[0] = new Jogador("Lucas"); //simulação
        //jogadores[1] = new Jogador("Joao"); //simulação
        for (int i = 0; i < jogadores.length; i++) {
            System.out.println("Informe o nome do Jogador " + (i + 1));
            nome = input.nextLine();
            jogadores[i] = new Jogador(nome);
        }
    }

    //distribuir as cartas
    private void distribuirCartas() {
        Carta carta = baralho.selecionaCarta();
        while (carta != null) {
            jogadores[0].incluir(carta);
            carta = baralho.selecionaCarta();
            if (carta != null) {
                jogadores[1].incluir(carta);
            }
            carta = baralho.selecionaCarta();
        }
    }

    //imprimir a quantidade de cartas de cada jogador :: para fins de debug
    private void imprimeInfo() {
        for (int i = 0; i < jogadores.length; i++) {
            System.out.println(jogadores[i].nome() + ": " + jogadores[i].numeroDeCartas());
        }
    }

    //jogada
    private void jogada(int rodada) {
        int vencedorRodada, escolha;
//        imprimeInfo();
        System.out.println("Vez do jogador " + jogadores[rodada - 1].nome());
        System.out.println();
        System.out.println("-------------------------------------");
        jogadores[rodada - 1].imprimePrimeiraCarta();

        escolha = selecionaAtributo();
        vencedorRodada = comparaValores(escolha);
        if (vencedorRodada == -1) {
            System.out.println("\tEmpate");
            for (int j = 0; j < mesa.size(); j++) {
                pilha.add(mesa.get(j));
            }
            mesa.clear();
        } else {
            pegarCartas(vencedorRodada);
        }
    }

    //jogador vencedor pega as cartas
    private void pegarCartas(int jogadorVencedor) {
        if (!pilha.isEmpty()) {
            for (int i = 0; i < pilha.size(); i++) {
                jogadores[jogadorVencedor].incluir(pilha.get(i));
            }
            pilha.clear();
        }
        for (int i = 0; i < mesa.size(); i++) {
            jogadores[jogadorVencedor].incluir(mesa.get(i));
        }
        mesa.clear();
    }

    //verificaFimJogo
    private boolean verificaFimJogo() {
        if (jogadores[0].numeroDeCartas() == 0 && !jogadores[0].temCartas()) {
            System.out.println("Parabéns " + jogadores[1].nome() + " você VENCEU!!!!");
            return true;
        } else if (jogadores[1].numeroDeCartas() == 0 && !jogadores[1].temCartas()) {
            System.out.println("Parabéns " + jogadores[0].nome() + " você VENCEU!!!!");
            return true;
        }
        return false;
    }

    //altera a rodada
    private int alteraRodada(int rodada) {
        if (rodada == jogadores.length) {
            rodada = 1;
        } else {
            rodada++;
        }
        return rodada;
    }

    //jogador seleciona atributo
    private int selecionaAtributo() {
        int escolha;
        do {
            System.out.println("--------------------------------");
            System.out.println("Qual atributo você escolhe: ");
            System.out.println("\t1. Tipo");
            System.out.println("\t2. Decomposição");
            System.out.println("\t3. Ataque");
            System.out.println("\t4. Reciclável");
            System.out.println("--------------------------------");
            Scanner ler = new Scanner(System.in);
            escolha = ler.nextInt();
//            escolha = atributoAleatorio();//simulação
//            System.out.println(escolha);//simulação
        } while (escolha < 1 || escolha > 4);

        //coloca as cartas na mesa
        for (int i = 0; i < jogadores.length; i++) {
            mesa.add(jogadores[i].excluir());
        }
        return escolha;
    }

    private int comparaValores(int escolha) {
        switch (escolha) {
            case 1:
                //tipo
                if (mesa.get(0).compararTipo(mesa.get(1)) == 1) {
                    System.out.println("\tVencedor da Rodada: " + jogadores[0].nome());
                    System.out.println();
                    return 0;
                } else if (mesa.get(1).compararTipo(mesa.get(0)) == 1) {
                    System.out.println("\tVencedor da Rodada: " + jogadores[1].nome());
                    System.out.println();
                    return 1;
                } else if (mesa.get(0).compararTipo(mesa.get(1)) == 0) {
                    //empate
                    return -1;
                } else if (mesa.get(1).compararTipo(mesa.get(0)) == 0) {
                    //empate
                    return -1;
                }
            case 2:
                //decomposição
                if (mesa.get(0).compararDecomposicao(mesa.get(1)) == 1) {
                    System.out.println("\tVencedor da Rodada: " + jogadores[0].nome());
                    System.out.println();
                    return 0;
                } else if (mesa.get(1).compararDecomposicao(mesa.get(0)) == 1) {
                    System.out.println("\tVencedor da Rodada: " + jogadores[1].nome());
                    System.out.println();
                    return 1;
                } else if (mesa.get(0).compararDecomposicao(mesa.get(1)) == 0) {
                    //empate
                    return -1;
                } else if (mesa.get(1).compararDecomposicao(mesa.get(0)) == 0) {
                    //empate
                    return -1;
                }
            case 3:
                //ataque
                if (mesa.get(0).compararAtaque(mesa.get(1)) == 1) {
                    System.out.println("\tVencedor da Rodada: " + jogadores[0].nome());
                    System.out.println();
                    return 0;
                } else if (mesa.get(1).compararAtaque(mesa.get(0)) == 1) {
                    System.out.println("\tVencedor da Rodada: " + jogadores[1].nome());
                    System.out.println();
                    return 1;
                } else if (mesa.get(0).compararAtaque(mesa.get(1)) == 0) {
                    //empate
                    return -1;
                } else if (mesa.get(1).compararAtaque(mesa.get(0)) == 0) {
                    //empate
                    return -1;
                }
            case 4:
                //compara atributo reciclável
                if (mesa.get(0).ehReciclavel() && !mesa.get(1).ehReciclavel()) {
                    System.out.println("\tVencedor da Rodada: " + jogadores[0].nome());
                    System.out.println();
                    return 0;
                } else if (!mesa.get(0).ehReciclavel() && mesa.get(1).ehReciclavel()) {
                    System.out.println("\tVencedor da Rodada: " + jogadores[1].nome());
                    System.out.println();
                    return 1;
                } else if (mesa.get(0).ehReciclavel() && mesa.get(1).ehReciclavel()) {
                    //empate
                    return -1;
                } else if (!mesa.get(0).ehReciclavel() && !mesa.get(1).ehReciclavel()) {
                    //empate
                    return -1;
                }
        }
        return 404;//erro
    }

    //para a simulação
    private int atributoAleatorio() {
        Random gerador = new Random();
        return gerador.nextInt(4) + 1;
    }

    public static void main(String[] args) {
        boolean jogando = true;
        Random gerador = new Random();
        int contador = 1;
        int rodada = gerador.nextInt(2) + 1;
        SuperTrunfoReciclagem jogo = new SuperTrunfoReciclagem();
        jogo.criarJogadores();
        jogo.distribuirCartas();
        while (jogando) {
            jogo.jogada(rodada);
            rodada = jogo.alteraRodada(rodada);
            jogando = !jogo.verificaFimJogo();
            contador++;
            System.out.println("\t\tRodada: " + contador);
        }
    }

}
