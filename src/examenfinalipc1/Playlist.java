/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfinalipc1;

/**
 *
 * @author Carlos
 */
public class Playlist {
    NodoDoble inicio;
    NodoDoble cola;
    int contador;
    public Playlist(){
        
    }
    public void addCancion(Cancion cancion){
        NodoDoble actual = new NodoDoble(cancion);
         contador++;
        if(isVacia()){
            inicio=cola=actual;
            
        }else{
            actual.siguiente=null;
            actual.anterior=cola;
            cola.siguiente=actual;
            cola=actual;
           
        }
    }
    public void MostrarPlaylist(){
        NodoDoble actual=inicio;
        while(actual!=null){
            actual.cancion.Reproducir();
            actual=actual.siguiente;
        }
    }
    public boolean isVacia(){
        return inicio==null && cola==null;
    }
}
