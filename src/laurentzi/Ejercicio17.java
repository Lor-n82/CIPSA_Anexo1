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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que solciite valores al usuario hasta que introduzca el valor -1. Entonces
        debe mostrársele al usuario la media de los valores introducidos. Importante: El valor -1 no
        debe incluirse en los cálculos. 
         */

        Scanner tc = new Scanner(System.in);

        double numero = 0, acumulador = 0;
        int contador = 0;

        while (numero != -1) {
            System.out.print("Introduzca un numero: ");
            numero = tc.nextDouble();
            if (numero != -1) {
                acumulador += numero;
                contador++;
            } 
        }

        System.out.println("La media es de " + (acumulador / contador));

    }

}
