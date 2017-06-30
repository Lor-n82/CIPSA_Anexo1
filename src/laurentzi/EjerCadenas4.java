/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laurentzi;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author marisol
 */
public class EjerCadenas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*bool checkFecha( String fecha, String formato )  Devuelve un valor lógico cierto si la cadena
        contiene una fecha expresada conforme al formato indicado en el segundo parámetro. En caso
        contrario devuelve falso.
        */
        
        GregorianCalendar c1=new GregorianCalendar();
        
        int dia, mes, año;
        
        dia=c1.get(Calendar.DAY_OF_MONTH);
        mes=c1.get(Calendar.MONTH);
        año=c1.get(Calendar.YEAR);
        
        System.out.println(dia+" de "+(mes+1)+" de "+año);
        
    }
    
}
