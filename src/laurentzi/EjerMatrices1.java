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
public class EjerMatrices1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*void reiniciar( int[] array, int valor )  Rellena todas las posiciones de la matriz con el valor
        indicado.
        */
        
        
        
        int [] lista=new int[5];
        int valor = 0;
        
        reiniciar(lista, valor);
        
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
        
    }
    
    public static void reiniciar(int [] lista, int valor){
        
        Scanner tc=new Scanner(System.in);

        for(int i=0;i<lista.length;i++){
            lista[i]=valor;
        }
    }
    
    
}
