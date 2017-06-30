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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que solicite la temperatura del agua al usuario. A continuación la aplicación
        debe mostrar los siguientes mensajes:
        a. Si la temperatura es inferior a 0  “HELADO”
        b. Si la temperatura está comprendida entre 0 incluido y 100 excluido  LIQUIDO
        c. Si la temperatura es igual o superior a 100  GASEOSO
        */
        
        Scanner tc=new Scanner(System.in);
        
        int temperatura;
        
        System.out.print("Introduce la temperatura: ");
            temperatura=tc.nextInt();
        
        if(temperatura<0)
            System.out.println("Helado");
        else if(temperatura>=0 && temperatura<100)
            System.out.println("Liquido");
        else
            System.out.println("Gaseoso");
    }
    
}
