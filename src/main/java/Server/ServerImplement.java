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
import RMI.RemoteInterface;
import java.rmi.server.UnicastRemoteObject;

public class ServerImplement  extends UnicastRemoteObject implements RemoteInterface{
    public ServerImplement () throws Exception{
        super();
    }
    @Override
    public String nombre (String cuenta) {
        String part=cuenta.split("@")[0].trim();
        return part;
            
    }
    @Override
    public String dominio (String cuenta){
        String part=cuenta.split("@")[1].trim();
        return part;
    
    }
    
    @Override
    public int cadena (String cuenta) {
        return cuenta.length();
    }
    
      @Override
    public int  vocal (String cuenta){
        int v=0;
        cuenta=cuenta.toLowerCase();
        for(int i =0; i<cuenta.length();i++){
            char c=cuenta.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
            v++;
            }
        }
         return v;
        
    }   
    @Override
    public int  consonan(String cuenta){
        cuenta=cuenta.toLowerCase();
        int x=0;
        for(int i=0;i<cuenta.length(); i++){
            char co=cuenta.charAt(i);
            if(co=='b'|| co=='c'|| co=='d' || co=='f' || co=='g' || co=='h'
                    || co=='j' || co=='k' || co=='l' || co=='m' || co=='n' || co=='p' || co=='q'
                    || co=='r'|| co=='s' || co=='t'||co=='v' || co=='w' || co=='x' || co=='y' || co=='z'){
                x++;
            }
        }
 
        return x;
        }
      /**  int co=(cuenta.length()-2)- vocal(cuenta);
        return co;**/
    }
