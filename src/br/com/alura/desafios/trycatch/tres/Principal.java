package br.com.alura.desafios.trycatch.tres;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Pesquise por um usuario do GitHub!");
        System.out.println("Digite abaixo o nome do usuario (username) do GitHub: ");

        var userName = leitor.nextLine();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.github.com/users/" + userName))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException();
            }

            var resposta = response.body();
            Gson gson = new Gson();

            GitHubUserApi teste = gson.fromJson(resposta, GitHubUserApi.class);
            var meuPerfil = new GitHubUser(teste);
            System.out.println(teste);
            System.out.println(meuPerfil);

        } catch (IOException | InterruptedException e) {
            System.out.println("Houve um erro durante a consulta a API do GitHub");
            System.out.println(e.getMessage());
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }

    }
}
