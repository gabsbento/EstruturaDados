package com.gabrielbento.vetor.teste;

import com.gabrielbento.estruturadados.vetor.Vetor;

public class Aula07 {
    public static void main(String[] args){
        Vetor vetor = new Vetor(10);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        vetor.adiciona("Elemento 4");

        System.out.println(vetor);

        vetor.adiciona(0, "Elemento 5");
        System.out.println(vetor);
    }
}
