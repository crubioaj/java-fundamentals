package FlujoDeControl;
public class ConvercionTipos {
    public static void main(String[] args) {
        //de string a char y de char a string
        char letra = 'c';
        String palabra = String.valueOf(letra);
        char vocal = palabra.charAt(0);
        System.out.println("char a string: " + vocal);
        //de int a char t de char a int
        int numero = 65;
        char letra2 = (char) numero;
        int numero2 = (int) letra2;
        System.out.println("int a char: " + letra2);
        System.out.println("char a int: " + numero2);
        //de string a int y de int a string
        String numero3 = "50";
        int numero4 = Integer.parseInt(numero3);
        String numero5 = String.valueOf(numero4);
        System.out.println("string a int: " + numero4);
        System.out.println("int a string: " + numero5);
        //de string a double y de double a string
        String numero6 = "3.1416";
        double numero7 = Double.parseDouble(numero6);
        String numero8 = String.valueOf(numero7);
        System.out.println("string a double: " + numero7);
        System.out.println("double a string: " + numero8);
        //de int a double y de double a int
        int numero9 = 100;
        double numero10 = (double) numero9;
        int numero11 = (int) numero10;
        System.out.println("int a double: " + numero10);
        System.out.println("double a int: " + numero11);
    }
}
