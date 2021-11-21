/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhofinal;

/**
 *
 * @author lucas.ferreira
 */
public abstract class Carta {

    private String codigo;
    private String nome;
    private String descricao;
    private String tipo;
    private Cor cor;
    private double decomposicao;
    private int ataque;

    //construtor?
    public Carta(String cod, String nome, String desc, String tipo, Cor cor, double decomp, int ataque) {
        this.codigo = cod;
        this.nome = nome;
        this.descricao = desc;
        this.tipo = tipo;
        this.cor = cor;
        this.decomposicao = decomp;
        this.ataque = ataque;
    }

    abstract boolean ehReciclavel();

    @Override
    public String toString() {
        return "Tipo: " + tipo
                + "\nNome: " + nome
                + "\nDesc: " + descricao
                + "\nCor: " + cor.toString()
                + "\nDecomposicao: " + decomposicao
                + "\nAtaque: " + ataque;
    }
    
    public int compararDecomposicao(Carta adversario){
        if(this.cor.toString().equals("maior") && adversario.codigo.charAt(1)!='1'){ //mega winner e adversario não possui carta com código q termina em 1
            return 1;//venceu
        }else{
            if(this.decomposicao>adversario.decomposicao){
                return 1;//venceu
            }else if(this.decomposicao<adversario.decomposicao){
                return -1;//perdeu
            }else{
                return 0; //empate
            }
        }
    }

    public int compararTipo(Carta adversario) {
        if (this.cor.toString().equals("maior")) {
            return 1; //venceu
        } else if (this.cor.toString().equals("menor")) {
            return -1;//perdeu
        } else if(this.cor.toString().equals("vermelho") && adversario.cor.toString().equals("preto")){
            return 0;
        }else if (this.cor.toString().equals("vermelho")
                && (adversario.cor.toString().equals("amarelo")
                || adversario.cor.toString().equals("menor")
                || adversario.cor.toString().equals("verde")
                || adversario.cor.toString().equals("marrom")
                || adversario.cor.toString().equals("cinza"))) {
            return 1;//venceu
        } else if (this.cor.toString().equals("azul")
                && (adversario.cor.toString().equals("vermelho")
                || adversario.cor.toString().equals("menor")
                || adversario.cor.toString().equals("amarelo")
                || adversario.cor.toString().equals("verde")
                || adversario.cor.toString().equals("marrom")
                || adversario.cor.toString().equals("cinza"))) {
            return 1;//venceu
        } else if (this.cor.toString().equals("amarelo")
                && (adversario.cor.toString().equals("verde")
                || adversario.cor.toString().equals("menor")
                || adversario.cor.toString().equals("marrom")
                || adversario.cor.toString().equals("cinza")
                || adversario.cor.toString().equals("preto")
                || adversario.cor.toString().equals("branco"))) {
            return 1;//venceu
        } else if (this.cor.toString().equals("verde")
                && (adversario.cor.toString().equals("marrom")
                || adversario.cor.toString().equals("menor")
                || adversario.cor.toString().equals("cinza")
                || adversario.cor.toString().equals("preto")
                || adversario.cor.toString().equals("branco")
                || adversario.cor.toString().equals("laranja"))) {
            return 1;//venceu
        } else if (this.cor.toString().equals("cinza")
                && (adversario.cor.toString().equals("preto")
                || adversario.cor.toString().equals("menor")
                || adversario.cor.toString().equals("branco")
                || adversario.cor.toString().equals("laranja")
                || adversario.cor.toString().equals("roxo")
                || adversario.cor.toString().equals("azul"))) {
            return 1;//venceu
        } else if (this.cor.toString().equals("marrom")
                && (adversario.cor.toString().equals("cinza")
                || adversario.cor.toString().equals("menor")
                || adversario.cor.toString().equals("preto")
                || adversario.cor.toString().equals("branco")
                || adversario.cor.toString().equals("laranja")
                || adversario.cor.toString().equals("roxo"))) {
            return 1;//venceu
        } else if (this.cor.toString().equals("roxo")
                && (adversario.cor.toString().equals("azul")
                || adversario.cor.toString().equals("menor")
                || adversario.cor.toString().equals("vermelho")
                || adversario.cor.toString().equals("amarelo")
                || adversario.cor.toString().equals("verde")
                || adversario.cor.toString().equals("marrom"))) {
            return 1;//venceu
        } else if (this.cor.toString().equals("branco")
                && (adversario.cor.toString().equals("laranja")
                || adversario.cor.toString().equals("menor")
                || adversario.cor.toString().equals("roxo")
                || adversario.cor.toString().equals("azul")
                || adversario.cor.toString().equals("vermelho")
                || adversario.cor.toString().equals("amarelo"))) {
            return 1;//venceu
        } else if (this.cor.toString().equals("preto")
                && (adversario.cor.toString().equals("branco")
                || adversario.cor.toString().equals("menor")
                || adversario.cor.toString().equals("laranja")
                || adversario.cor.toString().equals("roxo")
                || adversario.cor.toString().equals("azul"))) {
            return 1;//venceu
        } else {
            return -1;//perdeu
        }
    }

    public int compararAtaque(Carta adversario){
         if(this.cor.toString().equals("maior") && adversario.codigo.charAt(1)!='1'){ //mega winner e adversario não possui carta com código q termina em 1
            return 1;//venceu
        }else{
            if(this.ataque>adversario.ataque){
                return 1;//venceu
            }else if(this.ataque<adversario.ataque){
                return -1;//perdeu
            }else{
                return 0; //empate
            }
        }
    }

}
