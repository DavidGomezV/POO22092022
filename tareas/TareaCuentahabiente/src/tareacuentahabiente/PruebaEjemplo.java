/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacuentahabiente;

/**
 *
 * @author david
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuentahabiente[]listaCH= new Cuentahabiente[5];
        listaCH[0]=new Cuentahabiente("id309183", "Jose", 54987.77f);
        listaCH[1]=new Cuentahabiente("id309184", "Manuel", 1003.00f);
        listaCH[2]=new Cuentahabiente("id309185", "Pedro", 73509.45f);
        listaCH[3]=new Cuentahabiente("id309186", "Carlos", 10000.08f);
        listaCH[4]=new Cuentahabiente("id309187", "Miguel", 0.01f);
        
        for (Cuentahabiente cuentahabiente : listaCH) {
            System.out.println(cuentahabiente.getNombre()+" " +cuentahabiente.evaluarNivelCliente());
        }
    }
    
}
