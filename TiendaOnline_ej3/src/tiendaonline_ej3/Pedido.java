/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaonline_ej3;

import tiendaonline_ej3.Productos;

public class Pedido {
    
// Declaración de atributos
private int importe;
private Productos[] productos;
// Constructor por defecto
public Pedido(){
    this.importe = 0;
    this.productos = new Productos[0];
}
// Constructor por parámetros
public Pedido(int importe, Productos[] productos){
    this.importe = importe;
    this.productos = productos.clone();
}
// Constructor de copia
public Pedido(Pedido pedidoACopiar){
    this.importe = pedidoACopiar.importe;
    this.productos = pedidoACopiar.productos.clone();
}
// Declaración de getters (1 por atributo)
public int getImporte(){
 return this.importe;
}
public Productos[] getProductos(){
    return this.productos;
}
// Declaración de setters (1 por atributo)
public void setProductos(Productos[] productos){
    this.productos = productos;
}
public void setImporte( int importe){
    this.importe = importe;
}
// Declaración de métodos personalizados
public boolean añadirProducto(){
    
    
    Productos[] carrito = new Productos[this.productos.length+1];
    
    
    for (int i = 0; i < carrito.length -1; i++) {
        carrito[i] = this.productos[i];
    }

    return true;
}
// Declaración toString() (con @Override)


}
