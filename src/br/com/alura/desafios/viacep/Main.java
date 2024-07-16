package br.com.alura.desafios.viacep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner leitor = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        GeradorArquivo geradorArquivo = new GeradorArquivo();

        System.out.println("Digite o CEP que voce queira pesquisar sem traços ou pontos (8 digitos): ");
        var cep = leitor.nextLine();

        while (cep.length() != 8 ) {
            System.out.println("Tamanho do CEP inválido. Apenas 8 digitos permitidos.");
            System.out.println("Digite o CEP novamente:");
            cep = leitor.nextLine();
        }

        try {
            var endereco = consultaCep.buscaEndereco(cep);
            geradorArquivo.geraJson(endereco);
            System.out.println(endereco);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação!");
        }

    }
}
