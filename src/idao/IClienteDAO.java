package idao;

import model.Cliente;

import java.util.List;

/**
 *
 * @author Luis Pizarro
 */
public interface IClienteDAO {
    public boolean Registrar(Cliente cliente);
    public List<Cliente> ObtenerListaClientes();
    public boolean Actualizar(Cliente cliente);
    public boolean Eliminar(Cliente cliente);
}//Fin IClienteDAO
