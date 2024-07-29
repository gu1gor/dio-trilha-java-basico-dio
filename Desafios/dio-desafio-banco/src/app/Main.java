package app;

import entities.Banco;
import entities.services.CadastrarCliente;
import entities.Cliente;
import entities.ContaCorrente;
import entities.ContaPoupanca;
import entities.services.Operacoes;

public class Main {
    public static void main(String[] args) {
        Main mainApp = new Main();
        mainApp.run();
    }

    public void run() {
        CadastrarCliente cadastro = new CadastrarCliente();
        Operacoes operacoes = new Operacoes();

        //Cria clientes e contas
        Cliente cliente0 = cadastro.criarCliente("Gustavo Mendes");
        ContaCorrente cc = cadastro.criarContaCorrente(cliente0);
        ContaPoupanca cp = cadastro.criarContaPoupanca(cliente0);

        //Realizar operações
        operacoes.realizarDeposito(cc, 100);
        operacoes.realizarTransferencia(cc, cp, 100);

        //Imprimir extratos
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        // Listar clientes
        Banco banco = new Banco();
        banco.addClientes(cliente0);
        banco.listarClientes();
        System.out.println();
    }
}
