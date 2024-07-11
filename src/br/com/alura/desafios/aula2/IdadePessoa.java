package br.com.alura.desafios.aula2;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean verificaMaioridade() {
        if (this.idade >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
