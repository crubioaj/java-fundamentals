package algebralineal;
import java.util.Arrays;
import java.util.Scanner;

public class MultiplicarMatrices{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa numero de filas de la primera matrix");
        int m = entrada.nextInt();
        System.out.println("ingresa numero de columnas de la primera matrix");
        int n = entrada.nextInt();
        System.out.println("ingresa numero de filas de la segunda matrix");
        int q = entrada.nextInt();
        System.out.println("ingresa numero de columnas de la segunda matrix");
        int p = entrada.nextInt();

        if(n!=q){
            System.out.println("no es posible hacer la multiplicacion");
        }else{
            double[][] firstMatrix = new double[m][n];
            double[][] secondMatrix = new double[q][p];
            SumarMatrices.crearMatrix(firstMatrix, entrada);
            SumarMatrices.crearMatrix(secondMatrix, entrada);

            int suma;
            int[][] multiplicacion = new int[firstMatrix.length][secondMatrix[0].length];
            for (int i=0;i<firstMatrix.length;i++){
                for(int j=0;j<secondMatrix[0].length;j++){
                    suma=0;
                    for(int k=0;k<firstMatrix[0].length;k++){
                        suma+=firstMatrix[i][k]*secondMatrix[k][j];
                    }
                    multiplicacion[i][j]=suma;
                }
            }
            System.out.println(Arrays.deepToString(multiplicacion));
        }
    }
}
