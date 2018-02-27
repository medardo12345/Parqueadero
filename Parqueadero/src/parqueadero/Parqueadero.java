/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import vehiculos.Moto;

/**
 *
 * @author DELL
 */
public class Parqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fichaVehiculo mifichaVehiculo;
        mifichaVehiculo=new fichaVehiculo();
        mifichaVehiculo.setVisible(true);
        
        Moto miMoto=new Moto();
        miMoto.marca="suzuki";
        miMoto.cilindraje=300;
        
        
        // TODO code application logic here
    }
    
}
