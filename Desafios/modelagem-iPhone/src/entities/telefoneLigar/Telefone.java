package entities.telefoneLigar;

import java.util.ArrayList;

public class Telefone extends Contato{

    public ArrayList<Contato> contatos;

    public Telefone() {
        contatos = new ArrayList<>();
    }

    public Telefone(String numero, String nome) {
        super(numero, nome);
    }

    public void addContato(Contato contato) {
        contatos.add(contato);
    }

    public void listarContatos() {
        System.out.println("Lista de Contatos: ");
        for (int i = 0; i < contatos.size(); i++) {
            System.out.println((i + 1) + ". " + contatos.get(i));
        }
    }

    public void ligar(int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            Contato contato = contatos.get(indice);
            System.out.println("Chamando... " + contato);
        } else {
            System.out.println("Chamada invalida!");
        }
    }

    public void atender(int indice) {

    }

    public void selecionarContato() {
        System.out.println("Selecione um Contato: ");
        listarContatos();

    }


}
