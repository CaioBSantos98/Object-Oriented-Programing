package br.com.alura.desafios.writer.tres;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
        Veiculo uno = new Veiculo("Fiat", "Uno Mille", 1996);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        var unoJson = gson.toJson(uno);

        System.out.println(uno);
        System.out.println(unoJson);
    }
}
