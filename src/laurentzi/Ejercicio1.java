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
public class Ejercicio1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear una aplicación que solicite al usuario el número de unidades de una
        mercancia, el precio, y muestre el importe de venta aplicando un descuento del 5% si
        el precio supera los 10€, y del 3% en caso contrario.*/
        
        //Creacion de un objeto de la clase Scanner
        Scanner teclado=new Scanner(System.in);
        
        //Atributos
        int mercancia;
        double precio;
        double importe;
        
        System.out.print("Introduce el numero de unidades: ");
            mercancia=teclado.nextInt();
            
        System.out.print("Introduce el precio por unidad: ");
            precio=teclado.nextDouble();
        
        if(precio >10)
            importe=(precio/100)*5;
        else
            importe=(precio/100)*3;
        
        System.out.println("\nEl precio es: "+precio+" €\n"
        +"El descuento es de : "+ importe+" €\n"
        +"El precio final es: "+(precio-importe));
        
    }
    
}
