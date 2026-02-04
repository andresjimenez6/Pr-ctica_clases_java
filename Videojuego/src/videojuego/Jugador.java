/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videojuego;

/**
 *
 * @author ANDRES JIMENEZ
 */
public class Jugador {
    private String nombre;
    private int nivelInicial;
    
    public Jugador(){
        this.nombre = "";
        this.nivelInicial = 1;
    }
    public Jugador(String nombre, int nivelInicial){
        this.nombre = nombre;
        this.nivelInicial = nivelInicial;
    }
    public Jugador(Jugador  jugadorACopiar){
        this.nombre = jugadorACopiar.nombre;
        this.nivelInicial = jugadorACopiar.nivelInicial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivelInicial(int nivelInicial) {
        this.nivelInicial = nivelInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelInicial() {
        return nivelInicial;
    }
    
    //toString con Override

    @Override
    public String toString() {
        return "Jugador" + "\nnombre=" + nombre + "\n nivelInicial=" + nivelInicial + '}';
    }
    
    
    
}
