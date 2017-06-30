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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que solicite dos valores. Si el primer número es mayor que el segundo debe
        mostrarse el mensaje “A MAYOR QUE B”. Si el segundo número es mayor que el primero debe
        mostrarse el mensaje “B MAYOR QUE A”. Si ambos valores son iguales debe mostrarse el
        mensaje “A IGUAL A B”.*/
        
        Scanner tc=new Scanner(System.in);
        
        int valor1, valor2;
        
        System.out.print("Introduce el primer valor: ");
            valor1=tc.nextInt();
        System.out.print("Introduce el segundo valor: ");
            valor2=tc.nextInt();
            
        if(valor1>valor2)
            System.out.println("A mayor que B");
        else if(valor2>valor1)
            System.out.println("B mayor que A");
        else
            System.out.println("A igual a B");
    }
    
}
