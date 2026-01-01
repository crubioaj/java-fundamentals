package Bucles;
import java.util.Scanner;
public class MCD {
    public static void main(String[] args) {
        // maximo comun divisor 
        Scanner entrada = new Scanner(System.in);
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int mcd = 1;
        for (int i = 1; i <= Math.min(numero1,numero2); i++){
            if (numero1 % i == 0 && numero2 % i == 0){
                mcd = i;
            }
        }
        System.out.println("el mcd de los dos numeros es: "+mcd);
        entrada.close();
    }
}
