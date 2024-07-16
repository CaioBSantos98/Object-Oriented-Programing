package br.com.alura.desafios.conexaoapi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CoinGecko {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha uma criptomoeda para verificar a cotação atual: ");

        System.out.println("1 - Bitcoin");
        System.out.println("2 - Ethereum");
        System.out.println("3 - Fluid Tether USD");
        System.out.println("4 - BNB");
        System.out.println("5 - Dogecoin");

        int valorSelecionado = leitor.nextInt();
        var endereco = "https://api.coingecko.com/api/v3/coins/";

        switch (valorSelecionado) {
            case 1:
                endereco += "bitcoin";
                break;
            case 2:
                endereco += "ethereum";
                break;
            case 3:
                endereco += "fluid-tether-usd";
                break;
            case 4:
                endereco += "binancecoin";
                break;
            case 5:
                endereco += "dogecoin";
                break;
            default:
                throw new Error("Codigo informado inválido!");
        }

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
