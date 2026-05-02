/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfinalipc1;

/**
 *
 * @author Carlos
 */
public class NodoDoble {
    Cancion cancion;
    NodoDoble anterior;
    NodoDoble siguiente;
    public NodoDoble(Cancion cancion){
        this.cancion=cancion;
        this.anterior=null;
        this.siguiente=null;
    }
}
