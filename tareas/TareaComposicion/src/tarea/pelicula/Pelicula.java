/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pelicula;

import pelicula.componentes.Actor;
import pelicula.componentes.Director;
import pelicula.componentes.Productora;

/**
 *
 * @author david
 */
public class Pelicula {
    private String titulo;
    private int duracionMins;
    private Director director;
    private Productora Productora;
    private Actor Actor;

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracionMins, Director director, Productora Productora, Actor Actor) {
        this.titulo = titulo;
        this.duracionMins = duracionMins;
        this.director = director;
        this.Productora = Productora;
        this.Actor = Actor;
    }

    public Actor getActor() {
        return Actor;
    }

    public void setActor(Actor Actor) {
        this.Actor = Actor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionMins() {
        return duracionMins;
    }

    public void setDuracionMins(int duracionMins) {
        this.duracionMins = duracionMins;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Productora getProductora() {
        return Productora;
    }

    public void setProductora(Productora Productora) {
        this.Productora = Productora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracionMins=" + duracionMins + ", director=" + director + ", Productora=" + Productora + ", Actor=" + Actor + '}';
    }
    
    public void reproducir(){
        System.out.println("reproduciendo desde 0:00");
    }
    
    
    
}
