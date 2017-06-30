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
public class EjerCadenas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*bool isNumero( String cadena )  Devuelve un valor lógico cierto si el valor de la cadena es un
        número. En caso contrario devuelve falso.
        */
        
        String cadena="Hola";
        
        System.out.println(isNumero(cadena));
    }
    public static boolean isNumero(String cadena){
        boolean numero=false;
            if(cadena.equalsIgnoreCase("1")||cadena.equalsIgnoreCase("2")||
               cadena.equalsIgnoreCase("3")||cadena.equalsIgnoreCase("4")||
               cadena.equalsIgnoreCase("5")||cadena.equalsIgnoreCase("6")||
               cadena.equalsIgnoreCase("7")||cadena.equalsIgnoreCase("8")||
               cadena.equalsIgnoreCase("9")||cadena.equalsIgnoreCase("0")){
            
               numero=true;
            }
        return numero;
    }
    
    
}
