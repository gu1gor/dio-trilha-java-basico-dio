package com.application;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência !: ");
        int numeroAgencia = sc.nextInt();
        sc.nextLine();
        System.out.print("Agora digite o numero da sua Agencia: ");
        String agencia = sc.nextLine();
        System.out.print("Digite seu Nome: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println();

        System.out.println("Olá " + nomeCliente.concat(" ") + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque\".");

        sc.close();
    }
}
