package ejercicioclasecalendar;

import java.util.Calendar;

public class EjercicioClaseCalendar {

    public static void main(String[] args) {
        //MOSTRANDO LA FECHA QUE NACI
        Calendar nacimiento = Calendar.getInstance();
        nacimiento.set(Calendar.YEAR, 1998);
        nacimiento.set(Calendar.MONTH, 07);
        nacimiento.set(Calendar.DATE, 23);
        System.out.println("Naci el: " + nacimiento.get(Calendar.DATE) + " de " + nacimiento.get(Calendar.MONTH) + " del año " + nacimiento.get(Calendar.YEAR));
        //MOSTRANDO FECHA ACTUAL
        Calendar fecha = Calendar.getInstance();
        System.out.println("Fecha actual: " + fecha.getTime());
        //CONTAR LOS DIAS
        System.out.println("Numero de dias: " + fecha.get(Calendar.DAY_OF_YEAR));
    }
}