package br.com.alura.desafios.usandoinstanceof;

public class Cachorro extends Animal {
    private String nome;
    private String raca;

    public Cachorro(String grupo, String nome) {
        super(grupo);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
