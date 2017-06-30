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
public class EjerMatrices3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int buscar( int[] array, int valor )  Devuelve la posición en la que se encuentra el valor
        indicado en la matriz. Si el valor no está en la matriz se devuelve el valor -1.
        */
        int [] lista={1,2,3,4};
        
        int valor=3;
        
        System.out.println(buscar(lista, valor));
        
    }
    public static int buscar(int [] lista, int valor){
        int x = -1;
        for(int i=0;i<lista.length;i++){
            if(valor==lista[i]){
                x=lista[i];
            }
        }
        return x;
    }
}
