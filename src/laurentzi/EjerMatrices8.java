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
public class EjerMatrices8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*void ordenar( String[] nombres )  Ordena la matriz alfabéticamente.
        */
        
        String [] lista={"Loren","Jokin","Irati"};
        
        ordenar(lista);
        
    }
    public static void ordenar (String [] nombres){
        Arrays.sort(nombres);
        
        for(int i=0;i<nombres.length;i++){
            System.out.println(nombres[i]);
        }
        
        
    }
    
}
