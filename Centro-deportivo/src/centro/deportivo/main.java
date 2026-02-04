/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package centro.deportivo;

/**
 *
 * @author ANDRES JIMENEZ
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        CentroDeportivo centro = new CentroDeportivo(10);

        Socio ana = new Socio("Ana", 1);
        Socio luis = new Socio("Luis", 2);

        Actividad yoga = new Actividad("Yoga", "Lunes 10:00", "Marta", 20);
        Actividad spinning = new Actividad("Spinning", "Martes 18:00", "Carlos", 25);

        System.out.println("INSCRIPCIONES");
        centro.inscribirSocio(ana, yoga);
        centro.inscribirSocio(ana, spinning);
        centro.inscribirSocio(luis, yoga);

        System.out.println();
        centro.mostrarActividadesDeSocio(ana);

        System.out.println();
        centro.mostrarActividadesDeSocio(luis);

        System.out.println();
        System.out.println("INGRESOS TOTALES ESPERADOS: 65 -> "
                + centro.calcularIngresosTotales());
    } 
    }
    

