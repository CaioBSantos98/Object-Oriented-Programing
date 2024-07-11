package br.com.alura.desafios.classpessoa.principal;

import br.com.alura.desafios.classpessoa.modelos.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var pessoa1 = new Pessoa();
        pessoa1.setNome("Caio");
        pessoa1.setIdade(25);
        var pessoa2 = new Pessoa();
        pessoa2.setNome("Jose Rodrigo");
        pessoa2.setIdade(33);
        var pessoa3 = new Pessoa();
        pessoa3.setNome("Evellyn");
        pessoa3.setIdade(30);

        var pessoas = new ArrayList<Pessoa>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        System.out.println("Tamanho da lista de pessoas: " + pessoas.size());
        System.out.println("Primeira pessoa da lista: " + pessoas.get(0));
        System.out.println(pessoas);
    }
}
