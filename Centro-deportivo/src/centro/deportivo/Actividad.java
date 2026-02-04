/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centro.deportivo;

/**
 *
 * @author ANDRES JIMENEZ
 */
public class Actividad {
     private String nombre;
    private String horario;
    private String responsable;
    private double precio;

    public Actividad(String nombre, String horario, String responsable, double precio) {
        this.nombre = nombre;
        this.horario = horario;
        this.responsable = responsable;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Actividad{" +
                "nombre='" + nombre + '\'' +
                ", horario='" + horario + '\'' +
                ", responsable='" + responsable + '\'' +
                ", precio=" + precio +
                '}';
    }
}
