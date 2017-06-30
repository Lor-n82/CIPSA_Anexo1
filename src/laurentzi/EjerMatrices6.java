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
public class EjerMatrices6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*void ordenar( int[] array )  Modifica la matriz ordenando sus valores de menor a mayor.
        */
        
        int [] lista={1,9,3,4,5};
        
        ordenar(lista);
    }
    
    public static void ordenar(int [] lista){
        int aux1;
        for(int i = 0; i < lista.length; i++) {
            for(int j = 0; j < lista.length; j++) {
                if(lista[i] < lista[j]) {
                    aux1 = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux1;
                }
            }
        }
        for(int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
}
