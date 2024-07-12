package br.com.alura.desafios.classproduto.modelos;

import java.util.Date;

public class ProdutoPerecivel extends Produto{
    private Date dataValidade;

    public ProdutoPerecivel(String nome, double preco, Date dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "{" +
                "nome = " + this.getNome() + ", " +
                "preco = " + this.getPreco() + ", " +
                "dataValidade = " + dataValidade +
                '}';
    }
}
