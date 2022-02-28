package tarealibro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class Libro{

private int NumPags;
private String Titulo;
private String autor;
private String editorial;
private int releaseDate;  

    public Libro() {
    }

    public Libro(int NumPags, String Titulo, String autor, String editorial, int releaseDate) {
        this.NumPags = NumPags;
        this.Titulo = Titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.releaseDate = releaseDate;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getNumPags() {
        return NumPags;
    }

    public void setNumPags(int NumPags) {
        this.NumPags = NumPags;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    public void cambiarPagina(){
        System.out.println("cambiando a la siguiente de pagina");
       
    }
    public void regresarPagina(){
        System.out.println("regresando pagina");
    }
}
