/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresasyproyectos;

/**
 *
 * @author EAG
 */
public class Empleado {
    private String nombre;
    private int salario;
    private double precioHora;
    
    
    public Empleado(){
        nombre = "";
        salario = 24000;
        precioHora= 12.5 ;
    }
    public Empleado(String nombre, int salario, double precioHora){
        this.nombre = nombre;
        this.salario = salario;
        this.precioHora = precioHora;
    }
    public Empleado(Empleado empleadoACopiar){
        this.nombre = empleadoACopiar.nombre;
        this.salario =empleadoACopiar.salario;
        this.precioHora = empleadoACopiar.precioHora;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return salario;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    
    @Override
    public String toString() {
        return "Empleado" + "nombre=" + nombre + "\n salario=" + salario + "\n precioHora=" + precioHora;
    }
}
