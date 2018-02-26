/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Carlos Lopez
 */
public class Moto extends Vehiculo{
    @Override
    public String acelerar(){
        return "Moto acelerando";
    }
    @Override
    public String frenar(){
        return "Moto frenando";
    }
    public String derrapar(){
        return "Moto derrapando";
    }
}
