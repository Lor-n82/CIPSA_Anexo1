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
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una función respuesta que reciba como parámetro una cadena de texto y devuelva un
        valor lógico. La función mostrará al usuario el mensaje indicado solicitando que responda SI o
        NO a la pregunta. Si el usuario constesta “SI” la función devuelve un valor lógico cierto. Si
        contesta “NO” la función devuelve un valor lógico falso. Si no contesta ninguna de las dos cosas
        se le mostrará un mensaje “RESPUESTA INCORRECTA” y se le repite la cuestión. 
         */

        String texto = "Responda Si o No: ";

        System.out.println(respuesta(texto));

    }

    public static boolean respuesta(String txt) {

        boolean respuesta = false;
        String contestacion;

        Scanner tc = new Scanner(System.in);

        do {

            System.out.print(txt);
            contestacion = tc.nextLine();

            if (contestacion.equalsIgnoreCase("si")) {
                respuesta = true;
            } else if (contestacion.equalsIgnoreCase("no")) {
                respuesta = false;
            } else {
                System.out.println("Respuesta incorrecta\n");
            }

        } while (contestacion.isEmpty());

        return respuesta;
    }

}
