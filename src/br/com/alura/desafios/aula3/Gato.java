package br.com.alura.desafios.aula3;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miau miau!");
    }

    public void arranharMoveis() {
        System.out.println("Arranhando movel!");
    }
}
