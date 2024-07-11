package br.com.alura.desafios.aula4.seis;

public class Produto implements Vendavel{
    private double preco;

    @Override
    public double precoTotalProduto(int quantidadeComprada) {
        double precoTotal = this.preco * quantidadeComprada;
        double desconto = 0;
        if (quantidadeComprada >= 10) {
            desconto = precoTotal * 0.05;
        }
        return precoTotal - desconto;
    }
}
