package br.com.alura.desafios.trycatch.um;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vamos fazer uma divisão?");
        System.out.println("Digite o numerador: ");
        var numerador = leitor.nextDouble();

        System.out.println("Digite o denominador: ");
        var denominador = leitor.nextDouble();

        try {
            Divisao divisao = new Divisao(numerador, denominador);
            System.out.println("O resultado da sua divisao foi: " + divisao.getResultado());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
