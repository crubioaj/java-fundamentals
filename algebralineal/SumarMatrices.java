package algebralineal;

import java.util.Scanner;
import java.util.Arrays;

public class SumarMatrices {
    protected static void crearMatrix(double[][] matrix, Scanner entrada){
        System.out.println("ingresa los terminos de la matrix");
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                matrix[i][j] = entrada.nextDouble();
            }
        }
    }
    private static void sumarMatrices(double[][] A, double[][] B, double[][] resultado){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                resultado[i][j] = A[i][j]+B[i][j];
            }
        }
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa el numero de filas");
        int m = entrada.nextInt();
        System.out.println("ingresa el numero de columnas");
        int n = entrada.nextInt();
        double[][] A = new double[m][n];
        double[][] B = new double[m][n];
        crearMatrix(A, entrada);
        crearMatrix(B, entrada);
        double[][] resultado = new double[m][n];
        sumarMatrices(A,B,resultado);
        System.out.println(Arrays.deepToString(resultado));
    }
}
