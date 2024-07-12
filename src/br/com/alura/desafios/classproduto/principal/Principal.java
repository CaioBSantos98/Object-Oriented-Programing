package br.com.alura.desafios.classproduto.principal;

import br.com.alura.desafios.classproduto.modelos.Produto;
import br.com.alura.desafios.classproduto.modelos.ProdutoPerecivel;

import java.util.ArrayList;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        var listaProdutos = new ArrayList<Produto>();
        var telefone = new Produto("Telefone", 1500);
        var monitor = new Produto("Monitor", 2500);
        var mouse = new Produto("Mouse", 500);
        var headset = new Produto("Headset", 800);

        listaProdutos.add(telefone);
        listaProdutos.add(monitor);
        listaProdutos.add(mouse);
        listaProdutos.add(headset);

        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Produto na segunda posição: " + listaProdutos.get(1));
        System.out.println(listaProdutos);

        var arroz = new ProdutoPerecivel("Arroz", 25, new Date(2024, 0, 20));
        listaProdutos.add(arroz);

        System.out.println(arroz);
        System.out.println(listaProdutos);

    }
}
