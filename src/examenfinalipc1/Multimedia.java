/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfinalipc1;

/**
 *
 * @author Carlos
 */
public abstract class Multimedia {
    private String nombre;
    private int duracion;
    
    public Multimedia(String nombre, int duracion){
        this.nombre=nombre;
        this.duracion=duracion;
     
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public abstract void Reproducir(); 
    
}
