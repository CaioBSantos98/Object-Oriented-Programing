package br.com.alura.desafios.aula4.cinco;

public class Livro implements Calculavel{
    private String titulo;
    private double preco;
    private int quantidade;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoTotal = preco * quantidade;
        double desconto = precoTotal * 0.05;
        return precoTotal - desconto;
    }
}
