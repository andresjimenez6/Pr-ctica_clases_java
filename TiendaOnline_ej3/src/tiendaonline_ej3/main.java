/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaonline_ej3;

/**
 *
 * @author EAG
 */
public class main {

    
    public static void main(String[] args) {
        Productos productoPorDefecto = new Productos();
        
        Productos tabaco = new Productos("Malboro",5);
        Productos pan = new Productos("Pan",1);
        Productos queso = new Productos("Queso",3);
        Productos carne = new Productos("Entrcot",10);
        
        
        System.out.println("CREACIÓN DE UN PRODUCTO POR DEFECTO Y USO DE SETTERS");
        System.out.println("Curso creado: ");
        // Probamos el toString
        
        System.out.println(tabaco);
        System.out.println(pan);
        System.out.println(queso);
        System.out.println(carne);
        
        
        //Prueba de getter de Curso
        System.out.println();
        System.out.println("PRUEBA DE GETTERS DE CURSO");
        System.out.println("NOMBRE ESPERADO: MALBORO -> " + tabaco.getNombre());
        System.out.println("PRECIO ESPERADO: 5 -> " + tabaco.getPrecio());
        
        System.out.println();
        System.out.println("PRUEBA DE GETTERS DE CURSO");
        System.out.println("NOMBRE ESPERADO: PAN -> " + pan.getNombre());
        System.out.println("PRECIO ESPERADO: 1 -> " + pan.getPrecio());
        
        System.out.println();
        System.out.println("PRUEBA DE GETTERS DE CURSO");
        System.out.println("NOMBRE ESPERADO: QUESO -> " + queso.getNombre());
        System.out.println("PRECIO ESPERADO: 3 -> " + queso.getPrecio());
        
        System.out.println();
        System.out.println("PRUEBA DE GETTERS DE CURSO");
        System.out.println("NOMBRE ESPERADO: Entrecot -> " + carne.getNombre());
        System.out.println("PRECIO ESPERADO: 10 -> " + carne.getPrecio());
        
        // Probamos los setters de la clase Alumno
        System.out.println();
        System.out.println("PRUEBA DE SETTERS DE PRODUCTOS");
        productoPorDefecto.setNombre("Caja de aguacates 4 ud.");
        productoPorDefecto.setPrecio(5);
        System.out.println(productoPorDefecto);
        // PEDIDO
        
        Pedido compraSemanal = new Pedido();
        
        //añadir producto
        compraSemanal.aniadirProducto(tabaco);
        compraSemanal.aniadirProducto(pan);
        compraSemanal.aniadirProducto(queso);
        compraSemanal.aniadirProducto(carne);
       
        // Prueba getter array alumnos
        System.out.println();
        System.out.println("PRUEBA DE GETTERS CON UN ARRAY DE PRODUCTOS");
        Productos[] productos = compraSemanal.getProductos();
        System.out.println("Número de alumnos esperado: 4 -> " + 
                productos.length);
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i].getNombre());
        }
        
        //Prueba del importe total
        
        System.out.println(compraSemanal.totalAcumulado(productos));
        
    }
    
}
