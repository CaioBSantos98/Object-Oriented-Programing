package br.com.alura.desafios.writer.dois;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        var titulo = new Titulo("Homem de Ferro", 2008, "Marvel Studio");

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        var tituloJson = gson.toJson(titulo);

        System.out.println(titulo);
        System.out.println(tituloJson);
    }
}
