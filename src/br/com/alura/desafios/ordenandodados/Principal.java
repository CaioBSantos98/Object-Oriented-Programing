package br.com.alura.desafios.ordenandodados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        // Desafio 1
        List listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(10);
        listaNumeros.add(40);
        listaNumeros.add(3);
        listaNumeros.add(20);
        listaNumeros.add(15);
        listaNumeros.add(11);
        listaNumeros.add(9);
        listaNumeros.add(13);
        listaNumeros.add(7);

        System.out.println(listaNumeros);
        Collections.sort(listaNumeros);
        System.out.println(listaNumeros);

        // Desafio 2 e 3
        List listaTitulos = new ArrayList<Titulo>();
        listaTitulos.add(new Titulo("The Walking Dead"));
        listaTitulos.add(new Titulo("Vikings"));
        listaTitulos.add(new Titulo("Breaking Bad"));
        listaTitulos.add(new Titulo("Friends"));

        System.out.println(listaTitulos);
        Collections.sort(listaTitulos);
        System.out.println(listaTitulos);

        // Desafio 4
        List novaLista = new ArrayList<>();
        List novaLista2 = new LinkedList();

        novaLista.add("teste");
        novaLista.add(2);
        novaLista.add(true);

        novaLista2.add("teste");
        novaLista2.add(2);
        novaLista2.add(true);

        System.out.println(novaLista);
        System.out.println(novaLista2);

    }
}
