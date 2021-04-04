/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

/**
 *
 * @author Maxangel
 */
import java.rmi.Remote;

public interface RemoteInterface extends Remote{
    public String nombre(String cuenta) throws Exception;
    public String dominio (String cuenta) throws Exception;
    public int  vocal (String cuenta) throws Exception;
    public int  consonan(String cuenta) throws Exception;
    public int  cadena(String cuenta) throws Exception;
    
    
}
