package Bucles;
import java.util.Scanner;
public class InvertirNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int numeroInvertido = 0;
        while (numero != 0){
            numeroInvertido = (numeroInvertido*10)+numero%10;
            numero/=10;
        }
        System.out.println(numeroInvertido);
    }
}

