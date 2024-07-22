package entities.telefoneLigar;

public class Contato {

    private String numero;
    private String nome;


    public Contato() {
    }

    public Contato(String numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "Contato - " + nome + "\n" + numero;
    }

}
