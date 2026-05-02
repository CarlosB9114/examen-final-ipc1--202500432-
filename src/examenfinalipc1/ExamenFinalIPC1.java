/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinalipc1;

/**
 *
 * @author Carlos
 */
public class ExamenFinalIPC1 {

    public static void main(String[] args) {
       Cancion cancion1 = new Cancion("Love", 500, "Justin");
       Cancion cancion2 = new Cancion("Shape of You", 240, "EdSheeran");
       Cancion cancion3 = new Cancion("Podcast", 320, "PicPod");
       cancion1.Reproducir();
       cancion2.Reproducir();
       cancion3.Reproducir();
        
    }
    
}
