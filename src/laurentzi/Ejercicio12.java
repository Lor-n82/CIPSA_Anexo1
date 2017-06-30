/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurentzi;

/**
 *
 * @author loren
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que muestre los números del 1 al 10 empleando los tres tipos de sentencias
        repetitivas vistas ( for, while, do while ). */
        
        int x=0, y=1;
        
        
        System.out.println("\nFOR\n");
        
        for(int i=1;i<11;i++){
            System.out.println(i);
            
        }
        
        System.out.println("\nWHILE\n");
        
        while(x<10){
            System.out.println(y);
            y++;
            x++;
        }
        
        System.out.println("\nDO WHILE\n");
        
        x=0;
        y=1;
        
        do{
            System.out.println(y);
            y++;
            x++;
        }while(x<10);
        
        
    }
    
}
