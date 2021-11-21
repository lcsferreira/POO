/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhofinal;

import java.util.ArrayList;

/**
 *
 * @author lucas.ferreira
 */
public class Jogador {
    private String nome;
    private ArrayList<Carta> cartas;
    
    public Jogador(String nome){
        this.nome = nome;
        cartas = new ArrayList<>();
    }
    
    public String nome(){
        return nome;
    }
    
    public int numeroDeCartas(){
        int contador = 0;
        for(int i = 0; i<cartas.size(); i++){
            if(cartas.get(i) != null){
                contador++;
            }
        }
        return contador;
    }
    
    public void incluir(Carta carta){
        if(cartas.isEmpty()){
            cartas.add(carta);
        }else{
            cartas.add(cartas.size(),carta);
        }
    }
    
    public Carta excluir(){
        Carta cartaAux;
        cartaAux =  cartas.get(0);
        cartas.remove(0);
        return cartaAux;
    }
    
    public void imprimePrimeiraCarta(){
        System.out.println(cartas.get(0).toString());
        System.out.println();
        System.out.println();      
    }
    
    public boolean temCartas(){
        if(!cartas.isEmpty()){
            return true;
        }
        return false;
    }
    
}
