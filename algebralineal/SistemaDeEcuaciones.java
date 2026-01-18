package algebralineal;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SistemaDeEcuaciones {
    private static int encontrarn(String fila) {
        int n = 0;
        if(fila.contains("x")){
            n = 1;
        }
        if(fila.contains("y")){
            n = 2;
        }
        if(fila.contains("z")){
            n = 3;
        }
        for(char c = 'w'; c >= 'a'; c--) {
            if(fila.contains(String.valueOf(c))) {
                n = ((119 - ((int) c)) + 4);
            }
        }
        return n;
    }

    private static void añadirLetra(double[][] matrix, String numero, int pos){
        if(!numero.equals("") && !numero.equals("-")){
            matrix[0][pos] = Double.parseDouble(numero);
            numero = "";
        }else if(numero.equals("-")){
            matrix[0][pos] = -1.0;
        }else if (numero.equals("")){
            matrix[0][pos] = 1.0;
        }
    }

    private static double[][] matriz(int n, String[] fila){
        double[][] matrix = new double[1][n];
        Arrays.fill(matrix[0],0.0);

        Pattern letraPattern = Pattern.compile("^[a-z]$");
        Pattern enteroPattern = Pattern.compile("^-?\\d+$");

        String numero = "";
        int pos = 0;
        for(String letra:fila){
            if(!letra.equals(" ") && !letra.equals("")){
                if (letraPattern.matcher(letra).matches()){
                    pos = encontrarn(letra)-1;
                    añadirLetra(matrix, numero, pos);
                    numero = "";
                }else if (letra.equals("=")){
                    numero = "";
                }else if ((enteroPattern.matcher(letra).matches()) || (letra.equals("-")) || (letra.equals("."))){
                    numero+=letra;
                }   
            }
        }
        matrix[0][n-1] = Double.parseDouble(numero);
        return matrix;
    }

    public static void main(String[] args) {
        String fila = "2x + y = 5";
        fila = fila.toLowerCase();
        int n = encontrarn(fila);
        String[] partes = fila.split("", 0);
        double[][] respuesta = matriz(n+1, partes);
        System.out.println(Arrays.deepToString(respuesta));

        //fila = "x - 3y = -7";
        //fila = "x - 3.14y = 5";
        //fila = "2x + 3y + z = 10";
        //fila = "-3.5x + y = 2";
        //fila = "2 x + y=5";
        n = encontrarn(fila);
        partes = fila.split("", 0);
        respuesta = matriz(n+1, partes);
        System.out.println(Arrays.deepToString(respuesta));
    }
}
