/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.libro;

import libro.componentes.Autor;
import libro.componentes.Editorial;

/**
 *
 * @author david
 */
public class Libro {
    private int numPags;
    private String titulo;
    private Autor autor;
    private Editorial editorial;

    public Libro() {
        autor = new Autor();
        editorial = new Editorial();
    }

    public Libro(int numPags, String titulo, Autor autor, Editorial editorial) {
        this.numPags = numPags;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "numPags=" + numPags + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    public void cambiarPagina(){
        System.out.println("cambiando a la siguiente pagina");
    }

    
    
    

  
    
    
    
}
