package Bucles;
import java.util.Scanner;
public class EncontrarPrimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int inicio = entrada.nextInt();
        int fin = entrada.nextInt();
        String lista = "";
        boolean primo;
        if (inicio <= 2 && fin >= 2) {
            lista = "2 ";
            inicio = 3;
        }
        int aumento = inicio%2==0? inicio+1:inicio; 
        for (int i = aumento; i<=fin; i+=2){
            primo = true;
            if (i % 3 == 0 && i!=3) {
                primo = false;
            } else {
                for(int j = 1;(6*j-1)<=(int) Math.sqrt(i);j++){
                    if (((i%(6*j-1))==0 || (i%(6*j+1))==0)){
                        primo = false;
                        break;
                    }
                }
            }
            if (primo) lista+=i+" ";
        }
        System.out.println(lista);
        entrada.close();
    }
}
