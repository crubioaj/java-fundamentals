package FlujoDeControl;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa alguna de las siguientes opciones: \n1) suma \n2) resta \n3) multiplicacion \n4) division");
        int numero = entrada.nextInt();
        System.out.print("ingres el primer numero: ");
        double n1 = entrada.nextDouble();
        System.out.print("ingres el segundo numero: ");
        double n2 = entrada.nextDouble();
        switch (numero) {
            case 1:
                System.out.println("la suma de "+n1+" y "+n2+" es de "+(n1+n2));
                break;
            case 2:
                System.out.println("la resta de "+n1+" y "+n2+" es de "+(n1-n2));
                break;
            case 3:
                System.out.println("la multiplicacion de "+n1+" y "+n2+" es de "+(n1*n2));
                break;
            case 4:
                System.out.println("la suma de "+n1+" y "+n2+" es de "+(n1/n2));
                break;
            default:
                System.out.println("opcion no valida");
                break;
        }
    }
}
