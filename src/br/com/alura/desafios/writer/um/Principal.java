package br.com.alura.desafios.writer.um;

import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        try {
            FileWriter escritor = new FileWriter("arquivo.txt");
            escritor.write("Conteúdo a ser gravado no arquivo.");
            escritor.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
