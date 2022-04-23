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
        
        int edad3=15;
        String resultado = "";
        if (edad3 <18 ){
            resultado= "menor de edad";
        }else{
            resultado= "mayor de edad";
        }
        System.out.println(resultado);
        
        //con ternario
        
        //<cond>?<true>:<false>;
        int edad4=25;
        String res = "";
        res = edad4 < 18? "Menor de edad" : "Mayor de edad";
        System.out.println(res);
        //version minima
        int edad5= 15;
        System.out.println(edad5<18?"Menor de edad":"Mayor de edad");
        
        int val1=1;
        int val2=2;
        
        //val 1 = 000000...000001;
        //val 2 = 000000...000010;
        System.out.println(val1 | val2);
        
        int val3=1;
        int val4=0;
        
        val4=val3<<1;
        
        System.out.println("------arreglos---------");
        int[] edades; //[]para ddecir que sera un arreglo aun no reserva memoria
        edades= new int[5];
        System.out.println(edades);
        edades[0]=10;
        System.out.println("la primer edad es"+edades[0]);
        
        //declarar e inicializar en una sola lnea
        int[]estaturas = new int[5];
        //se puede asignar directamnete
        int[]pesos = {89,88,56,76,77};
         System.out.println(pesos[0]);
         System.out.println(pesos[1]);
         System.out.println(pesos[2]);
         System.out.println(pesos[3]);
         System.out.println(pesos[4]);
         
         //imprimir lo mismo pero con for
         
         System.out.println("----------con for---------");
         for (int i=0; i<pesos.length;i++){
             System.out.println(pesos[i]);
         }
         System.out.println("orden inverso");
         for (int k=pesos.length-1;k>=0;k--){
             System.out.println(pesos[k]);
         }
         
        System.out.println("Arreglo de alumnos");
        Alumno[]lista = new Alumno[5];
        lista[0]= new Alumno("99999", 2, 9.0f);
        lista[1]= new Alumno("99998", 2, 7.0f);
        lista[2]= new Alumno("99997", 3, 10.0f);
        lista[3]= new Alumno("99996", 2, 5.0f);
        lista[4]= new Alumno("99995", 2, 9.0f);
        
        for (int i=0; i< lista.length;i++){
            Alumno alumno = lista[i];
            System.out.println(alumno.evaluarDesempenio());
        }
        
        System.out.println("----for each-------");
        for (Alumno alumno : lista) {
            System.out.println(alumno.evaluarDesempenio());
        }
        
            
    }
    
}
