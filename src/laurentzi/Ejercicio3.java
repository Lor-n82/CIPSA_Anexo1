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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que solicite al usuario su nombre y después muestre le salude con el
        mensaje “Bienvenido XXXX”*/
        
        Scanner teclado=new Scanner(System.in);
        
        String nombre;
        
        System.out.print("Introduce tu nombre: ");
        nombre=teclado.nextLine();
        
        System.out.println("Bienvenido "+nombre);
        
    }
    
}
