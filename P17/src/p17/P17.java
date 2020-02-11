package p17;

import java.util.Scanner;

public class P17 {
    
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        
        int euro;
        float dollar;
        double dollarD;
        String dollarS;
        String euroS;
        int dollarI;
        
        int option = -1;

        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();

            switch (option) {
                case 1:                   
                    System.out.print("Insert euros = ");
                    euro = keyboard.nextInt();
                    dollar = functionIntFloat(euro);
                    System.out.println(euro + "€"+" = "+ dollar+"$");
                    break;

                case 2:
                    System.out.print("Insert euros = ");
                    euro = keyboard.nextInt();
                    dollarD = functionIntDouble(euro);
                    System.out.println(euro + "€"+" = "+ dollarD+"$");
                    break;
                    
                case 3: 
                    System.out.print("Insert euros = ");
                    euro = keyboard.nextInt();
                    dollarS = functionIntString(euro);
                    System.out.println(euro + "€"+" = "+ dollarS+"$");        
                    break;
                    
                case 4:
                    System.out.print("Insert euros = ");
                    euroS = keyboard.next();
                    dollarI = functionStringInt(euroS); 
                    System.out.println(euroS + "€"+" = "+ dollarI+"$");
                    break;
                    
                case 5:
                    p5();
                    break;
                case 6:
                    p6();
                    break;
                case 7:
                    p7();
                    break;
                case 8:
                    p8();
                    break;
                case 9:
                    p9();
                    break;
                case 10:
                    p10();
                    break;
                case 0:
                    p0();
                    break;
                default:
                    System.out.println("Option no aviable");
            }
        }
    }

    private static void userMenu() {
        System.out.println("Author: Alex Navarro");
        System.out.println("Option 1-(Random-tirar un dado)");
        System.out.println("Option 2-(Random-tirar un dado N veces)");
        System.out.println("Option 3-(Lotería)");
        System.out.println("Option 4-(Formato de un número)");
        System.out.println("Option 5-(ASCII)");
        System.out.println("Option 6-(Juego aleatorio)");
        System.out.println("Option 7-(Juego aleatorio)");
        System.out.println("Option 8- Uso de for");
        System.out.println("Option 9- Uso de while");
        System.out.println("Option 10-Uso de do while");

        System.out.println("Option 0- Exit");
        System.out.print("\nOption == ? ");

    }
    
    
    private static float functionIntFloat(int euro){
        float dollar=0;
        
        dollar = (euro * 1.1f);
        
        return dollar;
    }
    
    private static double functionIntDouble(int euro){
        double dollarD=0;
        
        dollarD = Double.valueOf(euro * 1.1);
        
        return dollarD;
    }
    
    private static String functionIntString(int euro){
        String dollarS = String.valueOf(euro);
        dollarS = String.valueOf(euro * 1.1);
        return dollarS;
    }
    
    private static int functionStringInt(String euroS){
        int dollarI = Integer.parseInt(euroS);
        dollarI = (int)(dollarI * 1.1);
        return dollarI;
    }
    
    
    
}
