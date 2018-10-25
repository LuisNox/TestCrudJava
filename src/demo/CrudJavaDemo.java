package demo;

import controller.ControllerCliente;
import model.Cliente;

/**
 *
 * @author Luis Pizarro
 */
public class CrudJavaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("456-1", "Alejandro", "Pizarro");
        Cliente cliente2 = new Cliente("789-4", "Test", "Eliminar");
        
        //Controlador
        ControllerCliente controllerCte = new ControllerCliente();
        
        //Guardar cliente a travez del controlador
        controllerCte.Registrar(cliente1);
        controllerCte.Registrar(cliente2);
        
        //Ver clientes
        controllerCte.VerClientes();
        
        //Editar un cliente por medio del id
        cliente1.setId(1);
        cliente1.setNombre("Luis");
        controllerCte.Actualizar(cliente1);
        
        controllerCte.VerClientes();
        
        //Eliminar un cliente por medio del ID
        cliente2.setId(2);
        controllerCte.Eliminar(cliente2);
        
        controllerCte.VerClientes();
        
    }//Fin main
    
}//Fin CrudJavaDemo
