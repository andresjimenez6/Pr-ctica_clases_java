/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centro.deportivo;

/**
 *
 * @author ANDRES JIMENEZ
 */
public class CentroDeportivo {
    private Inscripcion[] inscripciones;
    private int numInscripciones;

    public CentroDeportivo(int maxInscripciones) {
        inscripciones = new Inscripcion[maxInscripciones];
        numInscripciones = 0;
    }

    // Inscribir socio en actividad
    public boolean inscribirSocio(Socio socio, Actividad actividad) {
        if (numInscripciones < inscripciones.length) {
            inscripciones[numInscripciones] =
                    new Inscripcion(socio, actividad);
            numInscripciones++;
            return true;
        }
        return false;
    }

    // Consultar actividades de un socio
    public void mostrarActividadesDeSocio(Socio socio) {
        System.out.println("Actividades de " + socio.getNombre() + ":");
        for (int i = 0; i < numInscripciones; i++) {
            if (inscripciones[i].getSocio() == socio) {
                System.out.println("- " +
                        inscripciones[i].getActividad().getNombre());
            }
        }
    }

    // Calcular ingresos totales
    public double calcularIngresosTotales() {
        double total = 0;
        for (int i = 0; i < numInscripciones; i++) {
            total += inscripciones[i].getImporte();
        }
        return total;
    }
}
