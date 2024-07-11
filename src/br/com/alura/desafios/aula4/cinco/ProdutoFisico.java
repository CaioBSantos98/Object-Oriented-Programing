package br.com.alura.desafios.aula4.cinco;

public class ProdutoFisico implements Calculavel{
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        double taxa = precoTotal * 0.05;
        return precoTotal - taxa;
    }
}
