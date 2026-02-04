/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego;

/**
 *
 * @author ANDRES JIMENEZ
 */
public class Participacion {
    private Jugador jugador;
    private Partida partida;
    
    
    public Participacion (Jugador jugador, Partida partida){
        this.jugador = jugador;
        this.partida = partida;
    }
    
    public Participacion (Participacion participacionACopiar){
        this.jugador= participacionACopiar.jugador;
        this.partida = particaACopiar.partida;
    }
    
    //metodos personalizados
    
    //toString con Override
    @Override
    public String toString(){
    return "El jugador " + this.jugador + " ha participado ";
    }
}
