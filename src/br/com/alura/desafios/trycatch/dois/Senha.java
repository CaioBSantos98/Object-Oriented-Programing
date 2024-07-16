package br.com.alura.desafios.trycatch.dois;

public class Senha {
    private String senha;

    public Senha(String senha) {
        if (senha.length() > 8) {
            throw new SenhaInvalidaException("A senha nao pode ter mais que 8 caracteres.");
        }
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Senha{" +
                "senha='" + senha + '\'' +
                '}';
    }
}
