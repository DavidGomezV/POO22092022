/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicion;

import libro.componentes.Autor;
import libro.componentes.Editorial;
import pelicula.componentes.Actor;
import pelicula.componentes.Director;
import pelicula.componentes.Productora;
import tarea.libro.Libro;
import tarea.pelicula.Pelicula;

/**
 *
 * @author david
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro lib1 = new Libro(97, "El Principito",
                new Autor("Frances", "antoine de saint-exupéry"),
                new Editorial("Éditions Gallimard", 2324));
        
        System.out.println(lib1);
        
        Pelicula peli1 = new Pelicula("Star Wars", 170, 
                new Director("George Lucas", 77),
                new Productora("Hollywood Studios", "Estados Unidos"),
                new Actor("Ewan McGregor", "Estadounidense"));
        
        System.out.println(peli1);
        
        
       
    }
    
}
