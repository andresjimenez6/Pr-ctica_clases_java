/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquierdevehiculos;

/**
 *
 * @author EAG
 */
public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private boolean disponible;
    
    //constructor por defecto
    public Vehiculo(){
        this.matricula = "";
        this.marca = "";
        this.modelo = "";
        this.disponible = true;
    }
    
    //constructor por parametros
    public Vehiculo(String matricula, String marca, String modelo, boolean disponible){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.disponible = disponible;
    }
    
    //constructor de copia
    public Vehiculo(Vehiculo vehivuloACopiar){
        this.matricula = vehivuloACopiar.matricula;
        this.marca = vehivuloACopiar.marca;
        this.modelo = vehivuloACopiar.modelo;
        this.disponible = vehivuloACopiar.disponible;
    }
    
    //getters

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    //setters

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    //Declaracion de metodods
    
    //toString
    
    public String toString(){
        String vehiculo = "Matricula : " + this.matricula + "\n" +
                "Marca: " + this.marca + "\n" +
                "modelo: " + this.modelo + "\n" +
                "Disponible: " + this.marca;
                
        return vehiculo;
    }
}
