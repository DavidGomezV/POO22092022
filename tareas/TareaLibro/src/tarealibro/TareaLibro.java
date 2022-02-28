/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibro;


/**
 *
 * @author david
 */
public class TareaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro lib1 = new Libro();
        lib1.setNumPags(228);
        System.out.println("numero de paginas: "+lib1.getNumPags());
        lib1.setTitulo("Jueguemos a contar y medir");
        System.out.println("titulo: "+lib1.getTitulo());
        lib1.setAutor("Francisco J");
        System.out.println("Autor: "+lib1.getAutor());
        lib1.setEditorial("CIME");
        System.out.println("editorial: "+lib1.getEditorial());
        lib1.setReleaseDate(2014);
        System.out.println("año de lanzamiento: "+lib1.getReleaseDate());
        
        
    
        
        
        
        
        
    }

    
    
}
