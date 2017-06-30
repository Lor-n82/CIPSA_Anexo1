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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear un programa que solicite al usuario un número secreto. Después el programa le pedirá al
        usuario que adivine el número. Si el usuario introduce un número superior el programa
        muestra el mensaje “NUMERO DEMASIADO GRANDE”. Si el usuario introduce un número
        inferior el programa muestra el mensaje “NUMERO DEMASIADO PEQUEÑO”.*/
        
        Scanner tc=new Scanner(System.in);
        
        int numSecreto, numUsu;
        
        System.out.print("Introduce un numero secreto: ");
            numSecreto=tc.nextInt();
       
        do{    
        System.out.print("Adivina el numero secreto: ");
            numUsu=tc.nextInt();
        
        if(numUsu<numSecreto)
            System.out.println("Numero demasiado pequeño");
        else if(numUsu>numSecreto)
            System.out.println("Numero demasiado grande");
        else if(numUsu==numSecreto)
            System.out.println("Has acertado el numero secreto !!!");
        }while(numUsu!=numSecreto);   
    }
    
}
