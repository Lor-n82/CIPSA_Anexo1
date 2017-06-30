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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea un programa que solicita un valor numérico comprendido entre 1 y 7 y devuelve el
        nombre de un día de la semana correspondiente, tal que el 1 es Lunes, y el 7 es el Domingo. */
        
        Scanner tc=new Scanner(System.in);
        
        int diaSemana;
        
        do{
        System.out.print("Introduce un numero entre 1 y 7: ");
            diaSemana=tc.nextInt();
            if(diaSemana<1 || diaSemana>7)
                System.out.println("Numero erroneo !!!");
        }while(diaSemana<1 || diaSemana>7);
        switch(diaSemana){
            case 1:System.out.println("Hoy es Lunes");;break;
            case 2:System.out.println("Hoy es Martes");;break;
            case 3:System.out.println("Hoy es Miercoles");;break;
            case 4:System.out.println("Hoy es Jueves");break;
            case 5:System.out.println("Hoy es Viernes");break;
            case 6:System.out.println("Hoy es Sabado");break;
            case 7:System.out.println("Hoy es Domingo");break;
        }
    }
    
}
