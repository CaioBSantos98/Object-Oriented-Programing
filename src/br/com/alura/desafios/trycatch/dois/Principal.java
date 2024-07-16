package br.com.alura.desafios.trycatch.dois;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Cadastre a sua senha: ");
        String senha = leitor.nextLine();

        try {
            Senha objetoSenha = new Senha(senha);
            System.out.println("Senha cadastrada com sucesso.");
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
