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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que solicite al usuario un nombre de usuario y una contraseña. El nombre
        de usuario correcto será “ALUMNO” y la contraseña “CIPSA”. Si el usuario introduce mal el
        nombre de usuario se indica el mensaje “USUARIO INCORRECTO”. Si el usuario introduce mal la
        contraseña se indica el mensaje “CONTRASEÑA INCORRECTA”. En cualquiera de los dos casos,
        la aplicación debe volver a solicitar el usuario y contraseña. Si el usuario falla por cinco veces se
        le muestra un mensaje “USUARIO RECHAZADO”. Si el usuario acierta se le muestra el mensaje
        “BIENVENIDO.” 
         */

        Scanner tc = new Scanner(System.in);

        String nombre, contraseña;
        int contador = 0;

        do {
            System.out.print("Introduce el nombre: ");
            nombre = tc.nextLine();
            System.out.print("Introduce la contraseña: ");
            contraseña = tc.nextLine();

            if (nombre.equals("ALUMNO") && contraseña.equals("CIPSA")) {
                System.out.println("Bienvenido");
            } else if (nombre.equals("ALUMNO") && !contraseña.equals("CIPSA")) {
                System.out.println("Contraseña incorrecta");
            } else if (!nombre.equals("ALUMNO") && contraseña.equals("CIPSA")) {
                System.out.println("Usuario incorrecto");
            }
            contador++;
//            System.out.println(contador);

        } while (!(nombre.equals("ALUMNO") && contraseña.equals("CIPSA")) && contador < 5);

        System.out.println("Usuario rechazado");
    }
}
