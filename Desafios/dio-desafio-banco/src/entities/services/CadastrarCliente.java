package entities.services;

import entities.Cliente;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class CadastrarCliente {

    public Cliente criarCliente(String nome) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        return cliente;
    }

    public ContaCorrente criarContaCorrente(Cliente cliente) {
        return new ContaCorrente(cliente);
    }

    public ContaPoupanca criarContaPoupanca(Cliente cliente) {
        return new ContaPoupanca(cliente);
    }


}
