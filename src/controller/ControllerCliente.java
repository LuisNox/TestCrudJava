package controller;

import java.util.ArrayList;
import java.util.List;

import dao.ClienteDAOImpl;
import idao.IClienteDAO;
import model.Cliente;
import view.ViewCliente;

/**
 *
 * @author Luis Pizarro
 */
public class ControllerCliente {
    
    private ViewCliente vistaCliente =  new ViewCliente();

    public ControllerCliente() {
    }
    
    //Llamar al DAO para guardar un Cliente
    public void Registrar(Cliente cliente){
        IClienteDAO dao = new ClienteDAOImpl();
        dao.Registrar(cliente);
    }
    
    //Llamar al DAO para actualizar un Cliente
    public void Actualizar(Cliente cliente){
        IClienteDAO dao = new ClienteDAOImpl();
        dao.Actualizar(cliente);
    }
    
    //Llamar al DAO para eliminar un Cliente
    public void Eliminar(Cliente cliente){
        IClienteDAO dao = new ClienteDAOImpl();
        dao.Eliminar(cliente);
    }
    
    //Llamar al DAO para obtener todos los clientes y luego mostrar en la vista
    public void VerClientes(){
        List<Cliente> clientes = new ArrayList<Cliente>();
        IClienteDAO dao = new ClienteDAOImpl();
        clientes = dao.ObtenerListaClientes();
        vistaCliente.verClientes(clientes);
    }
    
}//Fin ControllerClientes
