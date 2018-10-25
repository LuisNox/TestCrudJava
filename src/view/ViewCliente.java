package view;

import java.util.List;

import model.Cliente;

/**
 *
 * @author Luis Pizarro
 */
public class ViewCliente {

    public void ViewCliente(Cliente cliente) {
        System.out.println("Datos del Cliente: " + cliente);
    }

    public void verClientes(List<Cliente> clientes) {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(i + ") Datos del Cliente: " + clientes.get(i).toString());
        }
    }

}//FIN ViewCliente
