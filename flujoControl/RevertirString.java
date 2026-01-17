package flujoControl;
import java.util.Scanner;
public class RevertirString{
    public static void main(String[] args){
        Scanner entrada =  new Scanner(System.in);
        String palabra = entrada.next();
        String palabrarevertida = "";
        for(int i=palabra.length()-1;i>=0;i--){
            palabrarevertida+=palabra.charAt(i);
        }
        System.out.println(palabrarevertida);
    }
}