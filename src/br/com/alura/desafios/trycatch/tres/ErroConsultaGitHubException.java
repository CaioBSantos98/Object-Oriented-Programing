package br.com.alura.desafios.trycatch.tres;

public class ErroConsultaGitHubException extends RuntimeException{
    private String message;

    public ErroConsultaGitHubException() {
        this.message = "Não foi possivel localizar esse usuário.";
    }

    public ErroConsultaGitHubException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
