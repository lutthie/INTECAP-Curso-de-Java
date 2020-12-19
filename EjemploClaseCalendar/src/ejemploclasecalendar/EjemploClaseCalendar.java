package ejemploclasecalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EjemploClaseCalendar {

    public static void main(String[] args) {
        //CALENDARIO DISTINTO
        Calendar fecha1 = Calendar.getInstance();
        //Fecha modificada
        fecha1.set(2019,10,28,18,14,6);
        System.out.println(fecha1.getTime());
        //CALENDARIO GREGORIANO
        Calendar fecha2 = new GregorianCalendar();
        //Fecha del sistema
        System.out.println(fecha2.getTime());
        //PARTE 2
        Calendar fecha3 = Calendar.getInstance();
        fecha3.set(Calendar.YEAR, 2019);
        fecha3.set(Calendar.MONTH, 11);
        fecha3.set(Calendar.DATE, 28);
        
        System.out.println("Año: " + fecha3.get(Calendar.YEAR));
        System.out.println("Mes: " + fecha3.get(Calendar.MONTH));
        //System.out.println("Mes: " + (fecha3.get(Calendar.MONTH)+ 1));
        System.out.println("Dia: " + fecha3.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia: " + fecha3.get(Calendar.DATE));
    }
}