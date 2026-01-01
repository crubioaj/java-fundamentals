package Bucles;
import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        
        if (numero <= 1) {
            System.out.println("el numero no es primo");
            return;
        }
        
        boolean esPrimo = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        
        if (esPrimo) {
            System.out.println("el numero es primo");
        } else {
            System.out.println("el numero no es primo");
        }
        
        entrada.close();
    }
}