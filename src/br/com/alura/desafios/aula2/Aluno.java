package br.com.alura.desafios.aula2;

public class Aluno {
    private String nome;
    private double notas;
    private int qtdNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
        this.qtdNotas++;
    }

    public double calcularMedia() {
        return notas / qtdNotas;
    }
}
