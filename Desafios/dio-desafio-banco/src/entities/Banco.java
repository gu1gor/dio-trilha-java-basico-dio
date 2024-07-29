package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco implements IBanco {

    protected List<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
    }

    @Override
    public void addClientes(Cliente cliente) {
        if (cliente != null) {
            clientes.add(cliente);
        } else {
            System.out.println("Cliente inválido.");
        }
    }

    @Override
    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");

        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }
}
