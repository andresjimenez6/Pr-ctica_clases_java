/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego;

/**
 *
 * @author ANDRES JIMENEZ
 */
public class Partida {
    private int duracion;
    
    public Partida(){
        this.duracion = 0;
    }
    public Partida(int duracion){
        this.duracion= duracion;
    }
    public Partida(Partida partidaACopiar){
        this.duracion = partidaACopiar.duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    //metodos personalizados
    
    //toString con Override
    @Override
    public String toString() {
        return "Partida{" + "duracion=" + duracion + '}';
    }
    
    
}
