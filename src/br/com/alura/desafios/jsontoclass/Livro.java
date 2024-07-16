package br.com.alura.desafios.jsontoclass;

public class Livro {
    private String nome;
    private String autor;
    private Editora editora;

    public Livro() {
        this.nome = null;
        this.autor = null;
        this.editora = null;
    }

    public Livro(String nome, String autor, Editora editora) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public Editora getEditora() {
        return editora;
    }

    @Override
    public String toString() {
        return "Livro: " + this.nome +
                " Autor: " + this.autor +
                " Editora: " + this.editora.getNome();
    }
}
