/*
Escuela Monlau 04/02/19

 */
package zellerg;


public class Zellerg {


    public static void main(String[] args) {
        int d= Zellerg(26, 4, 2001);
        System.out.println(d);   
        String[] arrayDay = new String[]{"Domingo","Martes","Lunes","Miercoles","Jueves","Viernes","Sábado",};
        System.out.println(arrayDay[d]);
        //modificamos el programa para visualizar el dia Lunes, Martes, ...
    }
    private static int Zellerg(int day, int month, int year){
        
        int Zeller;
        month = (month + 10) % 12;
        year = year - 1 * ((month > 10)?1:0);
        Zeller = (13 * month -1) / 5 +1 + year % 100 + (year % 100) / 4 + (-2 * (year / 100)) + (year / 400) % 7;
        Zeller = ((Zeller + day) % 7 + 6) % 7; 
        
        return Zeller;
    }
    
}
