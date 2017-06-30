/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurentzi;

import java.util.Arrays;

/**
 *
 * @author CIPSA
 */
public class EjerMatrices2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Int[] extraer( int[] array, int indxInicio, int indxFin )  Devuelve una matriz con los valores
        contenidos entre las posiciones ( ambas incluidas ) indicadas en la matriz pasada como
        parámetro.
        */
        int [] lista={1,2,3,4,5};
        
        int ini=2, fin=4;
        
        extraer(lista, ini, fin);
        
    }
        public static int [] extraer(int [] lista, int indxInicio, int indxFin){
            
            for(int i= indxInicio;i<indxFin;i++){
                System.out.println(lista[i]);
            }
            return lista;
        }
    
}
