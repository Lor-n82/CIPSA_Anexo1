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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crea una aplicación que solicite al usuario la temperatura de una serie de
        días y muestre al final la media. Para ello la aplicación debe solicitar la temperatura de
        un día y preguntar si desea introducir otra. 
         */

        Scanner tc = new Scanner(System.in);

        double temperatura, media = 0;
        int dia = 0;
        String respuesta;

        do {
            dia++;
                System.out.print("Introduce la temperatura del dia " + dia+": ");
                    temperatura = tc.nextDouble();
            media += temperatura;
            tc.nextLine();//Limpiar Buffer
                System.out.print("Deseas introducir la temperatura del dia " + (dia+1) + "?(Si/No): ");
                    respuesta = tc.nextLine();
        } while (respuesta.equalsIgnoreCase("Si"));

        System.out.println("La media total de los " + dia + " dias es de " + (media / dia));

    }

}
