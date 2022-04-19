/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 20;
        System.out.println("edad= "+edad);
        Integer edad2 = new Integer(22);
        System.out.println(edad2);
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println("------------------------");
        //convertir strings a entero
        String cadena = "99";
        int altura = Integer.parseInt(cadena); //metodo miembro o metodo de clase
        //olor c1 = Color.BLUE 
        altura += 1;
        System.out.println("Altura="+altura);
        
        float y= Float.parseFloat(cadena);
        y=y+0.5f;
        System.out.println("Altura="+y);
        
        System.out.println("------------------");
        
        Arbol tree1 = new Arbol(2.4f, 35);
        System.out.println(tree1);
        System.out.println("troncos de un arbol:"+Arbol.tronco);
        
        JOptionPane.showMessageDialog(null, "Hola mundo", "aqui va el titulo", JOptionPane.ERROR_MESSAGE);
        String dato = JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir datos", JOptionPane.QUESTION_MESSAGE);
        System.out.println(dato);
    }
    
}
