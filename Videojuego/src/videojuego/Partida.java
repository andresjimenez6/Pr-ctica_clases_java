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
    private Jugador [] jugadores;
    public Partida(){
        this.duracion = 0;
        this.jugadores = new Jugador[0];
    }
    public Partida(int duracion){
        this.duracion= duracion;
        this.jugadores = jugadores;
    }
    public Partida(Partida partidaACopiar){
        this.duracion = partidaACopiar.duracion;
        this.jugadores = partidaACopiar.jugadores;
    }

    public int getDuracion() {
        return duracion;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }
    

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }
    
    //metodos personalizados
    public boolean aniadirJugador(Jugador  jugadores){
        
        
        Jugador[] pl = new Jugador[this.jugadores.length + 1];
    
    
        for (int i = 0; i < pl.length -1; i++) {
            pl[i] = this.jugadores[i];
        }
    
        pl[pl.length - 1] = jugadores;
    
        this.setJugadores(pl);
        
        
        return true;
    }
    
    //toString con Override
    @Override
    public String toString() {
        return "Partida{" + "duracion=" + duracion + '}';
    }
    
    
}
