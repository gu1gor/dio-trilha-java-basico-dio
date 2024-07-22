package entities.mediaPlay;

public class Musica {

    private String nomeMusica;
    private String artista;

       public Musica(String nomeMusica, String artista) {
        this.nomeMusica = nomeMusica;
        this.artista = artista;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }


    @Override
    public String toString() {
        return "Musica: " + nomeMusica + "Artista: " + artista;
    }
}
