package Bucles;
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        //minimo comun multiplo
        Scanner entrada = new Scanner(System.in);
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int n1 = 1;
        int n2 = 1;
        while (true){
            if (numero1*n1 == numero2*n2){
                System.out.println("el lcm es "+numero1*n1);
                break;
            }else if(numero1*n1<numero2*n2){
                n1++;
            }else{
                n2++;
            }
        }
        entrada.close();
    }
}
