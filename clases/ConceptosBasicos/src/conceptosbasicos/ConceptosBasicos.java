/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbasicos;

import ico.fes.Alumno;
import ico.fes.Automovil;
import ico.fes.Foco;
import ico.fes.Persona;
import ico.fes.Silla;
import java.awt.Color;

/**
 *
 * @author david
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola de nuevo");
        Silla s1 =new Silla();
        System.out.println(s1);
        System.out.println(s1.toString());
        
        Automovil miBocho = new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        
        System.out.println(miBocho);
        
        Automovil miMustang =new Automovil("Ford", "Mustang", Color.yellow, 2010);
        System.out.println(miMustang);
        
        Automovil miAkura = new Automovil("Akura", "NSX", Color.gray, 2013);
        System.out.println(miAkura);
         
        Persona per1 = new Persona();
        //per1.edad=200; no se permite por seguridad de encapsulamiento
        per1.setEdad(200000);
        System.out.println(per1);
        
        Alumno al1 =new Alumno();
        al1.setCarrera("ico");
        al1.setGrupo("2209");
        al1.setNumeroCuenta("310907979");
        al1.setNombre("jose");
        System.out.println(al1);
        
        
        
        
        
    }
    
}
