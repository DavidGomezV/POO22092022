/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reutilizacioncodigo2209;

import ico.fes.herencia.Alumno;
import ico.fes.herencia.Persona;

/**
 *
 * @author david
 */
public class PruebaPolimorfismo {
    
    public static void main (String[] args){
        System.out.println("prueba polimorfismo");
        Persona per1 = new Persona();
        per1.setNombre("Jose ");
        per1.dormir();
        Alumno al1 = new Alumno();
        al1.setNombre("jose ");
        al1.dormir();
    }
    
}
