package model;

/**
 *
 * @author Luis Pizarro
 */
public class Cliente {

    private int id;
    private String ci;
    private String nombre;
    private String apellido;

    public Cliente() {
        //Constructor vacio
        id = -1;
        ci = "0-0";
        nombre = "nn";
        apellido = "na";
    }

    public Cliente(String cedulaIdentidad, String _nombre, String _apellido) {
        //Constructor con parametros
        id = 0;
        ci = cedulaIdentidad;
        nombre = _nombre;
        apellido = _apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return this.id + ", " + this.ci + ", " + this.nombre + ", " + this.apellido;
    }

}//Fin clase Cliente
