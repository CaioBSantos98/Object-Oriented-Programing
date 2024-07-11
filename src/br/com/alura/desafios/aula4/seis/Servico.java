package br.com.alura.desafios.aula4.seis;

public class Servico implements Vendavel{
    private double preco;

    @Override
    public double precoTotalProduto(int quantidadeComprada) {
        double precoTotal = this.preco * quantidadeComprada;
        double desconto = 0;
        if (quantidadeComprada >= 5) {
            desconto = precoTotal * 0.10;
        }
        return precoTotal - desconto;
    }
}
