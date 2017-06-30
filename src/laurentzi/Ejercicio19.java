/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurentzi;

/**
 *
 * @author CIPSA
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que muestre por pantalla la tablas de multiplicar de los números del 1 al
        10. El resultado por pantalla debe ser: 
        */
        
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }
    }
    
}
