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
public class EjerCadenas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int getSubCadena( String cadena, String subcadena )  Devuelve el número de veces que
        aparece ‘subcadena’ en ‘cadena’.
        */
        
        String cadena="Hola soy Loren, Hola";
        String subcadena="Hola";
        
        System.out.println(getSubCadena(cadena, subcadena));
    }
    public static int getSubCadena(String cadena, String subcadena){
        int contador = 0;
        int index;
        index=cadena.indexOf(subcadena);
            
        
           
        System.out.println(cadena.indexOf(subcadena, index));
        
        return contador;
}
}
    

