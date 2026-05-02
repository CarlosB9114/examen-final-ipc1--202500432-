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
    NodoDoble actual;
    int contador;
    public Playlist(){
        
    }
    public void addCancion(Cancion cancion){
        NodoDoble nuevo = new NodoDoble(cancion);
         contador++;
        if(isVacia()){
            inicio=cola=actual=nuevo;
            
        }else{
            nuevo.siguiente=null;
            nuevo.anterior=cola;
            cola.siguiente=nuevo;
            cola=nuevo;
            
           
        }
    }
    public void MostrarPlaylist(){
        NodoDoble nuevo=inicio;
        while(nuevo!=null){
            nuevo.cancion.Reproducir();
            nuevo=nuevo.siguiente;
        }
    }
    public void Siguiente(){
        
        if(actual.siguiente==null){
            System.out.println("No hay mas canciones que reproducir");
        }else{
            actual=actual.siguiente;
            actual.cancion.Reproducir();
            
        }
    }
    public void Anterior(){
      
        if(actual.anterior==null){
            System.out.println("No hay mas canciones previas a reproducir");
        }else{
            actual=actual.anterior;
            actual.cancion.Reproducir();
        }
    }
    public boolean isVacia(){
        return inicio==null && cola==null;
    }
    public void EliminarActual(){
        if(actual==null){
            System.out.println("Lista Vacia");
            
        } else if(inicio==cola){
            inicio=null;
            cola=null;
            actual=null;
        }
        else if(actual==inicio){
            inicio=inicio.siguiente;
            inicio.anterior=null;
            actual=inicio;
        }else if(actual==cola){
            cola=cola.anterior;
            cola.siguiente=null;
            actual=cola;
        }else{
            actual.anterior.siguiente=actual.siguiente;
            actual.siguiente.anterior=actual.anterior;
            actual=actual.siguiente;
        }
    }
}
