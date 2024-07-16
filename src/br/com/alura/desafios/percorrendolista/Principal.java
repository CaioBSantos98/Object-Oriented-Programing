package br.com.alura.desafios.percorrendolista;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var lista = new ArrayList<String>();
        lista.add("Joao");
        lista.add("Maria");
        lista.add("Jose");
        lista.add("Gabriel");
        lista.add("Jesus");

        lista.forEach(System.out::println);

    }

}
