package br.com.alura.desafios.aula5.principal;

import br.com.alura.desafios.aula5.modelos.MinhasPreferidas;
import br.com.alura.desafios.aula5.modelos.Musica;
import br.com.alura.desafios.aula5.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BelchiorCast");
        meuPodcast.setHost("Caio Belchior");

        for (int i = 0; i < 800; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 100; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(minhaMusica);
        minhasPreferidas.inclui(meuPodcast);
    }
}
