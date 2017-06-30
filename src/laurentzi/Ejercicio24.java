/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurentzi;

/**
 *
 * @author loren
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    
    enum TipoOperacion  {
            suma,resta,multiplicacion,division
        };
    
    public static void main(String[] args) {
        /*Crea un método Calculadora que reciba como parámetros dos valores
        enteros y un valor del tipo enumerado TipoOperación. El método debe devolver el
        resultado correspondiente a la operación indicada como un valor de tipo double. 
        */
        int numero1=2, numero2=3;
//        TipoOperacion tipo;
//        tipo = TipoOperacion.suma;
        
        System.out.println(calcular(numero1, numero2, TipoOperacion.resta));
        
    }

    
    public static double calcular (int num1, int num2, TipoOperacion operacion){
        double resultado = 0;
        
        if(operacion == TipoOperacion.suma)
            resultado=num1+num2;
        else if(operacion == TipoOperacion.resta)
            resultado=num1-num2;
        else if(operacion == TipoOperacion.multiplicacion)
            resultado=num1*num2;
        else if(operacion == TipoOperacion.division)
            resultado=num1/num2;
        return resultado;
    }
    
}
