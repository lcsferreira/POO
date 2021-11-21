/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhofinal;

/**
 *
 * @author lucas.ferreira
 */
public class Reciclavel extends Carta{
    
    public Reciclavel(String cod,String nome, String desc, String tipo, Cor cor, double decomp, int ataque){
        super(cod,nome, desc, tipo, cor, decomp, ataque);
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nReciclável: sim";
    }

    @Override
    public boolean ehReciclavel() {
        return true;
    }
    
}
