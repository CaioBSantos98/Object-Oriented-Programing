package br.com.alura.desafios.trycatch.um;

public class Divisao {
    private double numerador;
    private double denominador;
    private double resultado;

    public Divisao(double numerador, double denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        if (denominador == 0) {
            throw new ArithmeticException("Não é possivel dividir por zero.");
        }
        this.resultado = numerador / denominador;
    }

    public double getNumerador() {
        return numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public double getResultado() {
        return resultado;
    }
}
