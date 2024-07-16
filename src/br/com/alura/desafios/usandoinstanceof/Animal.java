package br.com.alura.desafios.usandoinstanceof;

public class Animal {
    private double peso;
    private String grupo;

    public Animal(String grupo) {
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
