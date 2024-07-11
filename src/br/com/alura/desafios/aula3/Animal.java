package br.com.alura.desafios.aula3;

public class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("Emitindo som!");
    }
}
