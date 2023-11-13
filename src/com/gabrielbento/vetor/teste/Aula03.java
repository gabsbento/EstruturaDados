package com.gabrielbento.vetor.teste;

import com.gabrielbento.estruturadados.vetor.Vetor;

public class Aula03 {

    public static void main(String[] args){
        Vetor vetor = new Vetor(2);
        try{
            vetor.adiciona("Elemento 1");
            vetor.adiciona("Elemento 2");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
