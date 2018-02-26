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
public class Camion extends Vehiculo{
    
    public String cargar(){
        return "Camión cargando";
    }
    
    public String descargar(){
        return "Camión descargando";
    }
}