/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurentzi;

import java.util.Scanner;

/**
 *
 * @author loren
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una función que solicite dos valores de tipo entero y muestre todos los valores
        comprendidos entre ellos. */
        
        mostrar();
    }
    public static void mostrar(){
        Scanner tc=new Scanner(System.in);
        
        int num1, num2;
        
        System.out.print("Introduzca un numero: ");
            num1=tc.nextInt();
        System.out.print("Introduzca otro numero: ");
            num2=tc.nextInt();
        
        for(int i=num1;num1<=num2;num1++){
            System.out.println(num1);
        }
    }
    
}
