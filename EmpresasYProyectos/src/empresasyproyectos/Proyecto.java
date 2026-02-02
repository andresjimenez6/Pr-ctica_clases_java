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
public class Proyecto {
    private String nombre;
    private int presup;
    private Empleado[] empleados;
    private 
    
    public Proyecto(){
        this.nombre ="";
        this.presup = 0;
        this.empleados = new Empleado[0];
    }
    public Proyecto (String nombre, int presup, Empleado[] empleados){
        nombre = this.nombre;
        presup = this.presup;
        empleados = this.empleados;
    }
    public Proyecto(Proyecto proyectoACopiar){
        nombre = proyectoACopiar.nombre;
        presup = proyectoACopiar.presup;
        empleados=proyectoACopiar.empleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPresup(int presup) {
        this.presup = presup;
    }
    
    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getPresup() {
        return presup;
    }
    
    public Empleado[] getEmpleados() {
        return empleados;
    }
    
    //Metodos personalizados
    
    public boolean asignarEmpleados(Empleado empleados){
    
    Empleado[] workers = new Empleado[this.empleados.length + 1];
    
    
    for (int i = 0; i < workers.length -1; i++) {
        workers[i] = this.empleados[i];
    }
    
    workers[workers.length - 1] = empleados;
    
    this.setEmpleados(workers);
        
        return true;
}
    
    public double costeTotal(Empleado[] empleados){
        double total=0;
        for (int i = 0; i < empleados.length; i++) {
             total+= this.empleados[i].getPrecioHora() ;
        }
        return total;
    }
    
    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", presup=" + presup + '}';
    }
    
}
