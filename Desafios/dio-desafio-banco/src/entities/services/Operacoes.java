package entities.services;

import entities.Conta;

public class Operacoes {

    public void realizarDeposito(Conta conta, double valor) {
        conta.depositar(valor);
    }
    public void realizarTransferencia(Conta origem, Conta destino, double valor) {
        origem.transferir(valor, destino);
    }
}
