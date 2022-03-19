/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.componentes;

/**
 *
 * @author david
 */
public class Autor {
    private String nacionalidad;
    private String nombre;

    public Autor() {
    }

    public Autor(String nacionalidad, String nombre) {
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" + "nacionalidad=" + nacionalidad + ", nombre=" + nombre + '}';
    }
    
    public void escribirLibro(){
        System.out.println("escribiendo nuevo libro");
    }
    
}
