/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurentzi;

/**
 *
 * @author marisol
 */
public class EjerCadenas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int getVocales( String cadena )  Devuelve el número vocales que aparecen en la cadena
        indicada como parámetro.
        */
        
        String cadena="Marisol Rico Rodriguez";
        
        getVocales(cadena);
    }
    public static void getVocales(String cadena){
        int contador=0;
        
        for(int i=0;i<cadena.length();i++){
            if((cadena.charAt(i)=='a') || (cadena.charAt(i)=='A') || (cadena.charAt(i)=='e') || (cadena.charAt(i)=='E') || (cadena.charAt(i)=='i') || 
               (cadena.charAt(i)=='I') || (cadena.charAt(i)=='o') || (cadena.charAt(i)=='O') || (cadena.charAt(i)=='u') || (cadena.charAt(i)=='U')){
                contador++;
            } 
        }
        System.out.println("El numero de vocales de la frase "+cadena+" es: "+contador);
    }
}
