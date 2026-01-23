/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaonline_ej3;


public class Productos {
    // DeclaraciÃ³n de atributos
    
private String nombre;
private int precio;

// Constructor por defecto

public Productos(){
    this.nombre = "";
    this.precio = 0;
}

// Constructor por parÃ¡metros
    
public Productos(String nombre, int precio){
    this.nombre = nombre;
    this.precio = precio;
}

// Constructor de copia
    
public Productos(Productos productosACopiar){
    this.nombre = productosACopiar.nombre;
    this.precio = productosACopiar.precio;
}

// DeclaraciÃ³n de getters (1 por atributo)
    
public  String getNombre(){
    return this.nombre;
}
public int getPrecio(){
    return this.precio;
}

// DeclaraciÃ³n de setters (1 por atributo)
    public void setNombre(String nombre){
    this.nombre = nombre;
}
public void setPrecio(int precio){
     this.precio = precio;
}


// Declaracion de metodos personalizados
    
// Declaracion toString() (con @Override)
    
@Override
public String toString(){
    String cadena = "Nombre del producto: " + this.nombre +
            "\n Precio: " + this.precio;
    
}
}

