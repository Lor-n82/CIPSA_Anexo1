/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurentzi;

import java.util.Scanner;

/**
 *
 * @author CIPSA
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que solicite al usuario su edad y después muestre el mensaje “ERES MAYOR
        DE EDAD” si la edad introducida es igual o mayor que 18. En caso contrario; debe mostrarse el
        mensaje “ERES MENOR”.*/
        
        Scanner teclado=new Scanner(System.in);
        
        int edad;
        
        System.out.print("Introduce tu edad: ");
            edad=teclado.nextInt();
        
        if(edad>=18)
            System.out.println("Eres mayor de edad");
        else
            System.out.println("Eres menor");
    }
    
}
