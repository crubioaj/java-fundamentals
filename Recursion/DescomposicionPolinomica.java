package Recursion;
import java.util.Arrays;
import java.util.Scanner;

//usar expresion regular que solo sean numeros o . aseguarte que solo sea un simbolo
public class DescomposicionPolinomica {
    private static String descomposicion(String numero, String polinomio, int fin, int inicio, boolean entero){
        if (entero){
            int digito = numero.charAt(fin-inicio)-'0';
            if (inicio == 0) return polinomio+=(digito+"x"+"10^"+inicio);
            return polinomio+=(digito+"x"+"10^"+inicio+" + ")+descomposicion(numero, polinomio, fin, inicio-1, entero);
        }else{
            int digito = numero.charAt(fin-1)-'0';
            if (fin == inicio) return polinomio+=(digito+"x"+"10^"+(-fin));
            return polinomio+=(" + "+digito+"x"+"10^"+(-fin)+" + ")+descomposicion(numero, polinomio, fin+1, inicio, entero);
        }
        }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingresa un numero: ");
        String numero = entrada.next();
        String polinomio = "";

        if (numero.indexOf(".")!=-1){
            String parte_entera = numero.substring(0,numero.indexOf("."));
            String parte_decimal = numero.substring(numero.indexOf(".")+1);
            System.out.print(numero+": "+descomposicion(parte_entera, polinomio, parte_entera.length()-1, parte_entera.length()-1, true));
            System.out.print(descomposicion(parte_decimal, polinomio,1, parte_decimal.length(), false));
        }else{
            int pos = numero.length();
            System.out.println(numero+": "+descomposicion(numero, polinomio, pos-1, pos-1, true));
        }  
    }
}
