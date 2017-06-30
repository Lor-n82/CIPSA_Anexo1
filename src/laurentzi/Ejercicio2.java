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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear una aplicación que muestre el texto correspondiente a las
        calificaciones numéricas de los exámenes de unos alumnos. Si la calificación es 0,1 o 2
        debe indicarse “MD”. Si la calificación es 3 o 4 se indica “INS”. Si la calificación es 5 se
        indica “SUF”. Si es 6 “BN”. Si es 7 o 8 “NT”. Si es 9 o 10 “SOB”.*/
        
        Scanner teclado=new Scanner(System.in);
        
        int nota = 0;
        String calificacion = null;
        
        System.out.print("Introduce la nota: ");
            nota=teclado.nextInt();
        
        switch(nota){
            case 1:
            case 2:
                calificacion="MD";break;
            case 3:
            case 4:
                calificacion="INS";break;
            case 5:
                calificacion="SUF";break;
            case 6:
                calificacion="BN";break;
            case 7:
            case 8:
                calificacion="NOT";break;
            case 9:
            case 10:
                calificacion="SOB";break;
            default:
                System.out.println("Error, nota introducida no valida: ");
        }
        System.out.println("Su clasificacione es un "+nota+" correspondiente a "+calificacion);
    }
    
}
