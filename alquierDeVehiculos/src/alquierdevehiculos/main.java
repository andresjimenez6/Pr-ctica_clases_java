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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //constructor por parametros    
    Vehiculo toyota = new Vehiculo("6942 BFF","Toyota","Supra",true);    
    
    //toString
    
    System.out.println(toyota); 
    //prueba de getters
    System.out.println("NOMBRE ESPERADO: Toyota -> " + toyota.getMarca());
    System.out.println("NOMBRE ESPERADO: 6942 BFF -> " + toyota.getMatricula());
    System.out.println("NOMBRE ESPERADO: Supra -> " + toyota.getModelo());
    System.out.println("NOMBRE ESPERADO: true -> " + toyota.getDisponible());
    
    //Probamos el setter (y el constructor por defecto de paso)
    Vehiculo mazda = new Vehiculo();
    mazda.setMarca("Mazda");
    mazda.setMatricula("6767 KFC");
    mazda.setModelo("Miata");
    mazda.setDisponible(true); 
    
    System.out.println(mazda);
    
    //Empresa
    
    Empresa crestaNevada = new Empresa();
    
    //incorporar vehiuculo
    crestaNevada.incorporarVehiculo(toyota);
    crestaNevada.incorporarVehiculo(mazda);
    //prueba getter array vehiculos
    
    System.out.println();
    System.out.println("PRUEBA DE GETTERS CON UN ARRAY DE VEHICULOS");
    Vehiculo[] vehiculos = crestaNevada.getVehiculos();
    System.out.println("Número de coches esperado: 2 -> " + 
             vehiculos.length);
    for (int i = 0; i < vehiculos.length; i++) {
        System.out.println("Vehiculo " + (i + 1) + ": " + vehiculos[i].getModelo());
        }
    }
    
    
}
