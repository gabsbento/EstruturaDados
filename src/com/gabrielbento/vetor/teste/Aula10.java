package com.gabrielbento.vetor.teste;

import com.gabrielbento.estruturadados.vetor.VetorObjetos;

import javax.naming.ldap.Control;

public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Gabriel","gabriel@gmail.com" ,"1234-4567");
        Contato c2 = new Contato("Daniel", "daniel@gmail.com","1234-4567");
        Contato c3 = new Contato("Pedro", "pedro@gmail.com","1234-4567");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho: " + vetor.getTamanho());
        System.out.println(vetor);
    }
}
