package Bucles;
import java.util.Arrays;
import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int[] serie = new int[n];
        serie[0] = 0;
        if (n > 1) {
            serie[1] = 1;
        }
        for (int i = 2; i<serie.length;i++){
            serie[i] = serie[i-1]+serie[i-2];
        }
        System.out.println(Arrays.toString(serie));
        entrada.close();
    }
}