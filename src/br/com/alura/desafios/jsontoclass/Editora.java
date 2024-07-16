package br.com.alura.desafios.jsontoclass;

public class Editora {
    private String nome;

    public Editora() {
        this.nome = null;
    }

    public Editora(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Editora: " + this.nome;
    }
}
