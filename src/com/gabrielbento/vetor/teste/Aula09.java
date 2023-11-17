package com.gabrielbento.vetor.teste;

import com.gabrielbento.estruturadados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args){
        Vetor vet = new Vetor(10);
        vet.adiciona("Elemento 1");
        vet.adiciona("Elemento 2");
        vet.adiciona("Elemento 3");
        vet.adiciona("Elemento 4");

        System.out.println(vet);
        vet.remove(2);
        System.out.println(vet);
    }
}
