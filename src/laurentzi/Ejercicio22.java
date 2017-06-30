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
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una función Max que reciba dos parámetros de tipo entero y retorne el mayor de ellos. 
        */
        
        Scanner tc=new Scanner(System.in);
        
        int numero1, numero2;
        
        System.out.print("Introduzca un numero entero: ");
            numero1=tc.nextInt();
        System.out.print("Introduzca otro numero entero: ");
            numero2=tc.nextInt();
            
        System.out.println("El numero mayor es: "+max(numero1, numero2));
        
    }
    public static int max(int num1, int num2){
        int max = 0;
        
        if(num1>num2)
            max=num1;
        else
            max=num2;
        
        return max;
    }
    
}
