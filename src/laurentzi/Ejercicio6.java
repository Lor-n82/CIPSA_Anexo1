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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Tenemos que hacer el programa para una máquina dispensadora de billetes de autobús. Los
        autobuses tienen 40 plazas. Esta máquina debe pedir repetitivamente el número de billetes
        que quiere compara un cliente hasta que se terminan. El cliente puede coger 1, 2 o hasta 5
        billetes. Si el cliente pide más de 5 billetes hay que indicarle que no puede pedir más de 5, y
        volverle a preguntar el número de billetes que desea. Cada vez que un cliente compre uno o
        varios billetes habrá que descontar el número de plazas libres en el autobús. Si un cliente pide
        más plazas de las que quedan libres hay que indicarle el número de plazas que quedan y
        preguntarle si quiere cogerlas o no. El usuario podrá contestar con un “NO”, o un “SI”, en cuyo
        caso, se le venden las plazas restantes y termina la aplicación. Cuando todas las plazas del
        autobús estén reservadas la máquina mostrará el mensaje: “Autobús lleno”. 
         */

        Scanner tc = new Scanner(System.in);

        final int plazasMax = 40;
        int plazasSolicitadas = 0;
        int acumulador = 0;
        int plazasRestantes;
        String respuesta;

        while (acumulador < plazasMax) {
            do {
                System.out.print("Plazas a solicitar (Max 5): ");
                plazasSolicitadas = tc.nextInt();
                if (plazasSolicitadas > 5) {
                    System.out.println("No se pueden solicitar mas de 5 plazas por persona");
                }
            } while (plazasSolicitadas > 5);
            acumulador = acumulador + plazasSolicitadas;
            plazasRestantes = (plazasMax - (acumulador - plazasSolicitadas));
            if (acumulador > plazasMax) {
                tc.nextLine();
                System.out.print("Solo quedan " + plazasRestantes + " plaza, desea adquirir dicho numero de plazas?(Si/No): ");
                respuesta = tc.nextLine();
                if (respuesta.equalsIgnoreCase("si")) {
                    acumulador = plazasMax;
                    System.out.println("Autobus lleno");
                } else {
                    acumulador -= plazasSolicitadas;
                }
            } else if (acumulador == plazasMax) {
                System.out.println("Autobus lleno");
            }

        }
    }
}
