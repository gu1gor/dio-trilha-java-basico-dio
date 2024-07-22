package app;

import entities.telefoneLigar.Contato;
import entities.telefoneLigar.Telefone;

import java.util.Scanner;

public class AparelhoTelefonico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Telefone telefone = new Telefone();

        telefone.addContato(new Contato("1196000-0101", "Gustavo"));
        telefone.addContato(new Contato("1196000-0202", "Igor"));
        telefone.addContato(new Contato("1196000-0303", "Leticia"));
        telefone.addContato(new Contato("1196000-0405", "Fatima"));


        while(true){
            System.out.println("\nTelefone:");
            System.out.println("1. Agenda ");
            System.out.println("2. Selecionar um contato ");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            System.out.println();

            switch (opcao) {
                case 1:
                    telefone.listarContatos();
                    break;
                case 2:
                    System.out.print("Ligar para: ");
                    int indice = sc.nextInt() - 1;
                    telefone.ligar(indice);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

    }
}
