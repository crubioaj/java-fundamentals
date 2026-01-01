package Bucles;
import java.util.Scanner;
public class Armstrong {
    // un numero de Armstrong es aquel que es igual a la suma de cada uno de sus digitos elevada al numero de digitos
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int numeroCopia1 = numero;
        int numeroCopia2 = numero;
        int amstrong = 0;
        int n = 0;
        while(numeroCopia1!=0){
            numeroCopia1/=10;
            n++;
        }
        while(numeroCopia2!=0){
            amstrong += (int) Math.pow(numeroCopia2%10,n);
            numeroCopia2/=10;
        }
        if(amstrong == numero){
            System.out.println("es un numero de amtrong");
        }else{
            System.out.println("no es un numero de amtrong");
        }
    }
}
