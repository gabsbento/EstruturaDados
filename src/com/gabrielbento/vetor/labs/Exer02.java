package com.gabrielbento.vetor.labs;

import com.gabrielbento.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class Exer02 {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<>(5);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        vetor.adiciona("Elemento 3");

        System.out.println(vetor.ultimoIndice("Elemento 3"));
    }
}
