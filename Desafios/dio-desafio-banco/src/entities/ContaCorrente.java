package entities;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta {

    private List<Cliente> clientes;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.clientes = new ArrayList<>();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta Corrente ***");
        super.imprimirInfosComuns();
    }
}
