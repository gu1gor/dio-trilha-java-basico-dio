package app;

import entities.mediaPlay.Musica;
import entities.mediaPlay.ReprodutorMusical;

import java.util.Scanner;

public class ReprodutorDeMusica {
    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

        reprodutorMusical.addMusica(new Musica("Shape of You", "Ed Sheeran"));
        reprodutorMusical.addMusica(new Musica("Blinding Lights", "The Weeknd"));
        reprodutorMusical.addMusica(new Musica("Bohemian Rhapsody", "Queen"));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Listar Músicas");
            System.out.println("2. Reproduzir Música");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    reprodutorMusical.listarMusicas();
                    break;
                case 2:
                    System.out.print("Digite o número da música: ");
                    int indice = sc.nextInt() - 1;
                    reprodutorMusical.tocar(indice);
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