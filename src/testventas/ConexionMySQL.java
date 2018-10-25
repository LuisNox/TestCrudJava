package testventas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Luis Pizarro
 */
public class ConexionMySQL {

    public static Connection conectar() {
        Connection con = null;
        //Credenciales
        String usuario = "root";
        String contrasena = "C0br3s4l";
        //String url = "jdbc:mysql://192.168.43.100:3306/ventas_test?user=" + usuario + "&password=" + contrasena;
        String url = "jdbc:mysql://192.168.43.100:3306/ventas_test";

        try {
            con = DriverManager.getConnection(url, usuario, contrasena);
            if (con != null) {
                System.out.println("Conectado a MySQL");
            }
        } catch (SQLException ex) {
            System.out.println("No se pudo conectar a MySQL:\n");
            ex.printStackTrace();
        }

        return con;
    }

}//Fin Clase ConexionMySQL
