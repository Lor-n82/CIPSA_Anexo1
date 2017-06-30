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
public class Ejerciicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea un programa que solicite al usuario cinco valores y muestre al final el número más grande
        y el más pequeño de los introducidos. */

        Scanner tc = new Scanner(System.in);

        int numero, mayor = 0, menor = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un numero: ");
            numero = tc.nextInt();
            if (numero > mayor) {
                mayor = numero;
            } else if (numero < mayor) {
                menor = numero;
            }
        }
        System.out.println("EL numero mayor es: " + mayor);
        System.out.println("EL numero menor es: " + menor);
    }

}
