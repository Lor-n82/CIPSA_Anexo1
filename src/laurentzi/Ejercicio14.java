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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que solicite un valor comprendido entre 1 y 10 y muestre a continuación la
        tabla de múltiplicar del valor introducido. 
        */
        
        Scanner tc=new Scanner(System.in);
        
        int numero;
        
        System.out.print("Introduce un numero del 1 al 10: ");
            numero=tc.nextInt();
            
        for(int i=0;i<11;i++){
            System.out.println(numero+" * "+i+" = "+(numero*i));
        }
    }
    
}
