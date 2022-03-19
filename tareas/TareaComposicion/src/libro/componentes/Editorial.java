/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.componentes;

/**
 *
 * @author david
 */
public class Editorial {
    private String nombre;
    private int numPublicaciones;

    public Editorial() {
    }

    public Editorial(String nombre, int numPublicaciones) {
        this.nombre = nombre;
        this.numPublicaciones = numPublicaciones;
    }

    public int getNumPublicaciones() {
        return numPublicaciones;
    }

    public void setNumPublicaciones(int numPublicaciones) {
        this.numPublicaciones = numPublicaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", numPublicaciones=" + numPublicaciones + '}';
    }
    
    public void publicarLibro(){
        System.out.println("publicando nuevo libro");
    }
    
}
