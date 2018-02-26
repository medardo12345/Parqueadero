/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;
import Parqueadero.*;
/**
 *
 * @author Carlos Lopez
 */
public class Principal {
    
    public static void main(String[] args){
        Camion cam = new Camion();
        Moto mot =  new Moto();
        
        System.out.println(mot.acelerar());
        System.out.println(cam.acelerar());
        FichaVehiculo f = new FichaVehiculo();
        f.setVisible(true);
        mot = f.moto;
        
         
        
    }
    
}
