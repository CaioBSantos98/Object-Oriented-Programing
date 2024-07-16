package br.com.alura.desafios.interfaceforma;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var listaFormas = new ArrayList<Forma>();
        listaFormas.add(new Circulo(3));
        listaFormas.add(new Circulo(4));
        listaFormas.add(new Circulo(5));
        listaFormas.add(new Circulo(6));
        listaFormas.add(new Quadrado(3));
        listaFormas.add(new Quadrado(4));
        listaFormas.add(new Quadrado(5));
        listaFormas.add(new Quadrado(6));

        listaFormas.forEach(forma -> {
            forma.calcularArea();
            if (forma instanceof Circulo circulo) {
                System.out.println(circulo.getArea());
            }
            if (forma instanceof Quadrado quadrado) {
                System.out.println(quadrado.getArea());
            }

        });

    }
}
