package br.com.alura.desafios.conexaoapi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TheMealDB {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o nome de uma receita: ");
        var receita = leitor.nextLine();
        var endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + receita;
        System.out.println(endereco);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
