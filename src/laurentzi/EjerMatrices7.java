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
public class EjerMatrices7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*boolean comparar( int[] array1, int[] array2 )  Devuelve un valor lógico si las dos matrices
        tienen la misma longitud y sus valores son los mismos. En caso contrario retorna el valor falso.
        */
        
        int [] lista1={1,2,3,4,5};
        int [] lista2={1,2,6,4,5};
        
        System.out.println(comparar(lista1, lista2));
    }
    public static boolean comparar(int [] lista1, int [] lista2){
        boolean iguales=false;
        
        if(Arrays.equals(lista1, lista2)){
            iguales=true;
        }
        return iguales;
    }
    
}
