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
public class Participacion {
    private int horasAsignadas;
    private Empleado empleado;

    
    public Participacion(int horasAsignadas, Empleado empleado) {
        this.horasAsignadas = horasAsignadas;
        this.empleado = empleado;
    }
    
    public Participacion(Participacion participacionACopiar){
        this.horasAsignadas = participacionACopiar.horasAsignadas;
        this.empleado = participacionACopiar.empleado;
    }

    public int getHorasAsignadas() {
        return horasAsignadas;
    }

    public Empleado getEmpleado() {
        return empleado;
    }
    
    //metodos personalizados
    
    // toString con @Override

    @Override
    public String toString() {
        return "Participacion{" + "empleado=" + empleado + ", horas asignadas=" + horasAsignadas + '}';
    }
    
   
    
    
    
}
