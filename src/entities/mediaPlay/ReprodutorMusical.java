package entities.mediaPlay;

import java.util.ArrayList;

public class ReprodutorMusical {

    private ArrayList<Musica> musicas;

    public ReprodutorMusical() {
        musicas = new ArrayList<>();
    }

    public void addMusica(Musica musica) {
        musicas.add(musica);
    }

    public void listarMusicas() {
        System.out.println("Lista de Músicas:");
        for (int i = 0; i < musicas.size(); i++) {
            System.out.println((i + 1) + ". " + musicas.get(i));
        }
    }

    public void tocar(int indice) {
        if (indice >= 0 && indice < musicas.size()) {
            Musica musica = musicas.get(indice);
            System.out.println("Reproduzindo: " + musica);
        } else {
            System.out.println("Indice invalido!");
        }
    }

    public void pausar() {
        System.out.println("Musica pausada");
    }

    public void selecionarMusica() {
        System.out.println("Selecione uma musica: ");
        listarMusicas();
    }
}


