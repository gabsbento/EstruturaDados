package com.gabrielbento.vetor.teste;

import com.gabrielbento.estruturadados.vetor.Vetor;

public class Aula08 {
    public static void main(String[] args){
        Vetor vet = new Vetor(3);
        vet.adiciona("Elemento 1");
        vet.adiciona("Elemento 2");
        vet.adiciona("Elemento 3");
        vet.adiciona("Elemento 4");
        vet.adiciona("Elemento 5");

        System.out.println(vet);
    }
}
