/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

import java.awt.Color;

/**
 *
 * @author david
 */
public class Automovil {
    private String marca; //atributos van en notacion lower camel case
    private String subMarca;//atributos van en lower camel case y desde la segunda palabra la primer letra es mayuscula
    private Color color;
    private int modelo;

    public Automovil() {
    }

    public Automovil(String marca, String subMarca, Color color, int modelo) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.color = color;
        this.modelo = modelo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", subMarca=" + subMarca + ", color=" + color + ", modelo=" + modelo + '}';
    }
    
    
    
    
}
