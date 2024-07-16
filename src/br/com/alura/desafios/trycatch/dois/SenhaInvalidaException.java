package br.com.alura.desafios.trycatch.dois;

public class SenhaInvalidaException extends RuntimeException{
    private String message;

    public SenhaInvalidaException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
