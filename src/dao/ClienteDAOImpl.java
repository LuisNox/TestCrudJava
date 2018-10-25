/*
Cliente DAO Implementado
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import idao.IClienteDAO;
import model.Cliente;
import testventas.ConexionMySQL;

/**
 *
 * @author Luis Pizarro
 */
public class ClienteDAOImpl implements IClienteDAO {

    @Override
    public boolean Registrar(Cliente cliente) {
        boolean registro = false;

        Statement stm = null;
        Connection con = null;
        //Query
        String query = "INSERT INTO clientes VALUES(NULL,'" + cliente.getCi() + "','";
        query += cliente.getNombre() + "','" + cliente.getApellido() + "')";
        //Conexion
        try {
            con = ConexionMySQL.conectar();
            stm = con.createStatement();
            stm.execute(query);
            registro = true;
            stm.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error: Clase ClienteDAOImpl, Metodo Registrar()\n");
            ex.printStackTrace();
        }

        return registro;
    }//Fin Registrar

    @Override
    public List<Cliente> ObtenerListaClientes() {
        List<Cliente> listaClientes = new ArrayList<Cliente>();

        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String query = "SELECT * FROM clientes ORDER BY id";

        try {
            con = ConexionMySQL.conectar();
            stm = con.createStatement();
            rs = stm.executeQuery(query);
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt(1));
                cliente.setCi(rs.getString(2));
                cliente.setNombre(rs.getString(3));
                cliente.setApellido(rs.getString(4));
                listaClientes.add(cliente);
            }
        } catch (SQLException ex) {
            System.out.println("Error: Clase ClienteDAOImpl, Metodo ObtenerListaClientes\n");
            ex.printStackTrace();
        }

        return listaClientes;
    }//Fin ObtenerListaClientes

    @Override
    public boolean Actualizar(Cliente cliente) {
        boolean actualizado = false;

        Connection con = null;
        Statement stm = null;
        //Query de actualizacion
        String query = "UPDATE clientes SET ";
        query += "ci='" + cliente.getCi() + "', ";
        query += "nombre='" + cliente.getNombre() + "', ";
        query += "apellido='" + cliente.getApellido() + "' ";
        query += "WHERE id=" + cliente.getId();
        //Ejecutar
        try {
            con = ConexionMySQL.conectar();
            stm = con.createStatement();
            stm.execute(query);
            actualizado = true;
        } catch (SQLException ex) {
            System.out.println("Error: Clase ClienteDAOImpl, Metodo Actualizar\n");
            ex.printStackTrace();
        }

        return actualizado;
    }//Fin Actualizar

    @Override
    public boolean Eliminar(Cliente cliente) {
        boolean eliminado = false;

        Connection con = null;
        Statement stm = null;
        //Query
        String query = "DELETE FROM clientes ";
        query += "WHERE id=" + cliente.getId();
        //Ejecutar
        try {
            con = ConexionMySQL.conectar();
            stm = con.createStatement();
            stm.execute(query);
            eliminado = true;
        } catch (SQLException ex) {
            System.out.println("Error: Clase ClienteDAOImpl, Metodo Eliminar\n");
            ex.printStackTrace();
        }

        return eliminado;
    }//Fin Eliminar

}//Fin ClienteDAOImpl
