/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquierdevehiculos;

/**
 *
 * @author EAG
 */
public class Empresa {
    private Vehiculo[] vehiculos;
    //constructor por defecto
public Empresa(){
    this.vehiculos = new Vehiculo[0];
}
    //constructor por parametros
public Empresa(Vehiculo[] vehiculos){
    this.vehiculos = vehiculos;
}
    //constructor de copia
public Empresa(Empresa empresaACopiar){
    this.vehiculos = empresaACopiar.vehiculos;
}
    //setter
public void setVehiculos(Vehiculo[] vehiculos) {
    this.vehiculos = vehiculos;
}
    //getter
public Vehiculo[] getVehiculos() {
    return vehiculos;
}
    // metodos personalizados
public boolean incorporarVehiculo(Vehiculo vehiculos){
    
    Vehiculo[] coches = new Vehiculo[this.vehiculos.length + 1];
    
    for (int i = 0; i < coches.length -1; i++) {
        coches[i] = this.vehiculos[i];
    } 
    
    coches[coches.length - 1] = vehiculos;
    
    this.setVehiculos(coches);
    
    return true;
}

public boolean alquilarVehiculo(Vehiculo vehiculos){
    
    if (vehiculos.getDisponible()) {
       
        vehiculos.setDisponible(false);
        return true;
        
    }
    return false;
}

    //toString
@Override
public String toString(){
    
    String hola = "dsasadas";
    
    return hola;
    
}
