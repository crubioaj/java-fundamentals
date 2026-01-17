package bucles;
public class Palindromo{
    public static void main(String[] args){
        String palabra = "reconocr";
        int ultima_posicion = palabra.length()-1;
        int primera_posicion = 0;
        while (primera_posicion < ultima_posicion){
            if (palabra.charAt(primera_posicion) != palabra.charAt(ultima_posicion)){
                System.out.println("No es palindromo");
                return;
            }
            primera_posicion++;
            ultima_posicion--;
        }
        System.out.println("Es palidromo");
    }
}