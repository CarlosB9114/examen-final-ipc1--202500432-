/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfinalipc1;

/**
 *
 * @author Carlos
 */
public class Cancion extends Multimedia {

    private String artista;
    public Cancion(String nombre, int duracion,String artista){
        super(nombre,  duracion);
        this.artista=artista;
        
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    @Override
    public void Reproducir() {
        System.out.println("Reproduciendo la canción: " +getNombre()  );
    }
    
}
