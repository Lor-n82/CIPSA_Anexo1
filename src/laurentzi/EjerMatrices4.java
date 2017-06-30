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
public class EjerMatrices4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int mayor( int[] array )  Devuelve el valor más grande de los almacenados en la matriz.*/
        
        int [] lista={1,2,3,4,5};
        
        System.out.println(mayor(lista));
        
    }
    public static int mayor(int [] lista){
        int max = 0, numero;
        
        for(int i=0;i<lista.length;i++){
            numero=lista[i];
            if(max<numero){
                max=numero;
            }
        }
        return max;
    }
}
