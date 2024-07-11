package br.com.alura.desafios.aula5.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private int classificacao;

    public void reproduzir() {
        this.totalDeReproducoes++;
    }

    public void curtir() {
        this.totalDeCurtidas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
