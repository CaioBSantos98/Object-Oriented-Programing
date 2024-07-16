package br.com.alura.desafios.conexaoapi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Pesquise por um livro: ");
        String livro = leitor.nextLine().replace(" ", "+");

        var endereco = "https://www.googleapis.com/books/v1/volumes?" +
                "q=" + livro +
                "&key=AIzaSyCG7HyEPMo2wMdrL3b4jgYM06UAsLXCLm0" +
                "&intitle=" + livro;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
