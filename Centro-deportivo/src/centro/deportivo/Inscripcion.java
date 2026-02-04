/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centro.deportivo;

/**
 *
 * @author ANDRES JIMENEZ
 */
public class Inscripcion {
    private Socio socio;
    private Actividad actividad;
    private double importe;

    public Inscripcion(Socio socio, Actividad actividad) {
        this.socio = socio;
        this.actividad = actividad;
        this.importe = actividad.getPrecio();
    }

    public Socio getSocio() {
        return socio;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public double getImporte() {
        return importe;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
                "socio=" + socio.getNombre() +
                ", actividad=" + actividad.getNombre() +
                ", importe=" + importe +
                '}';
    }
}
