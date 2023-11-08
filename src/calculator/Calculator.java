
package calculator;

import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca primer numero");
        double a = sc.nextDouble();
        System.out.println("Introduzca segundo numero");
        double b = sc.nextDouble();
        
        System.out.println("Introduzca la opcion deseada");
        System.out.println("Introduzca 1 para sumarlos");
        System.out.println("Introduzca 2 para restarlos");
        System.out.println("Introduzca 3 para multiplicarlos");
        System.out.println("Introduzca 4 para dividirlos");
        int options = sc.nextInt();
         
        switch(options){
            case 1: System.out.println("La suma es igual a "+ (a+b));
            break;
            case 2: System.out.println("La diferencia es igual a "+ (a-b));
            break;
            case 3: System.out.println("El producto es igual a "+ (a*b));
            break;
            case 4: if(b!=0){
                        System.out.println("El cociente es igual a "+ a/b);}
                    else
                        System.err.println("La division por cero no esta definida");
            break;
            default: System.err.println("Opcion no valida");
        }
        
    }
}
