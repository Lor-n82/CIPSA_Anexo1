/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurentzi;

/**
 *
 * @author CIPSA
 */
public class EjerMatrices5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*void muestraInvertido( int[] array )  Muestra los valores contenidos en la matriz a la inversa,
        es decir; empezando desde la última posición hasta la primera.
        */
        
        int [] lista={1,2,3,4,5};
        
        muestraInvertido(lista);
        
    }
    public static void muestraInvertido(int [] lista){
        for(int i=lista.length-1;i>=0;i--){
            System.out.println(lista[i]);
        }
    }
    
}
