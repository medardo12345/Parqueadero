/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import parqueadero.fichaVehiculo;

/**
 *
 * @author Carlos Lopez
 */
public class Principal {
    
    public static void main(String[] args){
        Camion cam = new Camion();
        Moto miMoto =  new Moto();
        
        System.out.println(Moto.acelerar());
        System.out.println(Camion.acelerar());
        fichaVehiculo mifichaVehiculo = new fichaVehiculo();
        mifichaVehiculo.setVisible(true);
        Moto = fichaMoto;
        
         
        
    }
    
}
