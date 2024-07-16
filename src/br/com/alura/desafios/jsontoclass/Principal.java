package br.com.alura.desafios.jsontoclass;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
        var pessoa = """
                {
                    "nome": "Caio Belchior",
                    "idade": 18,
                    "cidade": "Tres Pontas - MG"
                }
                """;

        Gson gson = new GsonBuilder().setLenient().create();

        Pessoa caio = gson.fromJson(pessoa, Pessoa.class);

        System.out.println(caio);

        var livro = """
                {
                    "nome": "As crônicas de gelo e fogo",
                    "autor": "George R. R. Martin",
                    "editora": {
                        "nome": "Suma"
                    }
                }
                """;

        Livro guerraDosTronos = gson.fromJson(livro, Livro.class);
        System.out.println(guerraDosTronos);
    }
}
