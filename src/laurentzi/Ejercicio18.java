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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que solicite al usuario un valor numérico comprendido entre 1 y 10.
        Después la aplicación debe ir preguntándole al usuario la tabla de múltiplicar. Si el usuario se
        equivoca en un resultado, la aplicación indicará un mensaje de error y volverá a solicitarle el
        resultado de la operación. Si el usuario no acierta a la tercera vez se contabiliza un error, se le
        muestra el resultado de la operación y se le pregunta la siguiente operación. 
         */

        Scanner tc = new Scanner(System.in);

        int numero, respuesta, contador = 0, errores = 0, resultado;

        System.out.print("Introduce un numero del 1 al 10: ");
        numero = tc.nextInt();
        for (int i = 1; i <= 10; i++) {
            contador = 0; 
            resultado = (numero * i);
            do{
                System.out.print(numero + " * " + i + " = ");
                respuesta = tc.nextInt();   
                if ( respuesta != resultado ) {
                    if ( contador < 2 ) System.out.println("Error. Vuelve a intentarlo"); 
                    contador++; 
                } else {
                    System.out.println("Correcto!");
                }
            }while(respuesta != resultado &&  contador<3);
            if ( respuesta != resultado ) {
                System.out.println("Intentos agotados. El resultado era: " + resultado); 
                errores++; 
            }
        }
        System.out.println("Has fallado " + errores + " veces");
    }
}
