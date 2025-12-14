    import java.util.Scanner;
import java.util.Arrays;
public class Fibonacci {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int[] fibonacci = new int[numero];
        for(int i=0;i<numero;i++){
            fibonacci[i]=i;
            if(i>=2){
                fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
            }
        }
        System.out.println(Arrays.toString(fibonacci));
        entrada.close();
    }
}
