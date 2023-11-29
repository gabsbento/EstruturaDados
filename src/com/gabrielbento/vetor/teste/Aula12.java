package com.gabrielbento.vetor.teste;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Elemento 1");
        arrayList.add("Elemento 2");

        System.out.println(arrayList);

        arrayList.add(1, "Elemento 3");

        System.out.println(arrayList);

        System.out.println(arrayList.contains("Elemento 1"));

        System.out.println(arrayList.indexOf("Elemento 2"));

        System.out.println(arrayList.size());
    }
}
