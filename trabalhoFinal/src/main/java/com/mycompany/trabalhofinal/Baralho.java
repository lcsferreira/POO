/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhofinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author lucas.ferreira
 */
public class Baralho {
    private ArrayList<Carta> baralho;
    private Random indice;
    
    public Baralho(){
        baralho = new ArrayList<>();
        lerArquivo("C:\\Users\\lucas.ferreira\\Desktop\\CC\\trabalhoFinal\\src\\main\\java\\com\\mycompany\\trabalhofinal\\Super Trunfo da Reciclagem.csv");
        indice = new Random();
    }
    
    public Carta selecionaCarta(){
        Carta carta = null;
        if(!baralho.isEmpty()){
            carta = baralho.remove(indice.nextInt(baralho.size()));
        }
        return carta;
    }
    
    private void lerArquivo(String arquivo){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            String linha;
            do {
                linha = reader.readLine();
                if(linha!= null){
                    baralho.add(adicionarCarta(linha));   
                }  
            }while(linha != null);
        }catch(IOException error){
            System.out.println(error);
        }
    }
    
    private Carta adicionarCarta(String linha){
        String valores[] = linha.split(";");
        if(valores[7].equals("sim")){
            return new Reciclavel(valores[0],
                                           valores[1],
                                           valores[2],
                                           valores[3],
                                           Cor.stringToCor(valores[4]),
                                           Double.parseDouble(valores[5]),
                                           Integer.parseInt(valores[6])
            );
        }else{
            return new NaoReciclavel(valores[0],
                                           valores[1],
                                           valores[2],
                                           valores[3],
                                           Cor.stringToCor(valores[4]),
                                           Double.parseDouble(valores[5]),
                                           Integer.parseInt(valores[6]));
        }
    }
    
}
