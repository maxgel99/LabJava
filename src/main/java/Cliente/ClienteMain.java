/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

/**
 *
 * @author Maxangel
 */
import RMI.RemoteInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;


public class ClienteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
                String direccion=JOptionPane.showInputDialog("Ingrese el correo electronico: ");
                Registry miRegistro=LocateRegistry.getRegistry("127.0.0.1",999);
                RemoteInterface s=(RemoteInterface) miRegistro.lookup("Cuenta");
                JOptionPane.showMessageDialog(null, "El nombre de usuario: "+ s.nombre(direccion)+
                        "\nEl dominio: "+s.dominio(direccion)+"\nEl largo de la cadena de texto: "+s.cadena(direccion)+
                                "\nLa cantidad de vocales: "+s.vocal(direccion)+ "\nLa cantidad de consonantes: "+s.consonan(direccion));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
}
