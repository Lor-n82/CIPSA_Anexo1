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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que solicite al usuario valores numéricos hasta que
        introduzca el -1, y muestre al final el sumatorio de todos los valores dados. 
         */

        double suma = 0, numero;

        Scanner tc = new Scanner(System.in);

        System.out.print("Introduce un numero: (-1 termina el programa)");
            numero = tc.nextDouble();

        while (numero != -1) {
            suma = suma + numero;
            System.out.print("Introduce un numero: (-1 termina el programa)");
                numero = tc.nextDouble();
        }
        System.out.println("La suma total es "+suma);

    }

}
