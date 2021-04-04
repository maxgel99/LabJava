/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

/**
 *
 * @author Maxangel
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Registry miRegistry=LocateRegistry.createRegistry(999);
            miRegistry.rebind("Cuenta", new  ServerImplement());
            System.out.println("CONEXION ESTABLECIDA");
            
        } catch (Exception e) {
            System.out.println("CONEXION FALLIDA");
            System.out.println(e.getMessage());
        }
    }
    
}
