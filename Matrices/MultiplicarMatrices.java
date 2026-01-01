package Matrices;
import java.util.Arrays;;

public class MultiplicarMatrices{
    public static void main(String[] args){
        int[][] firstMatrix = { {1, 2, 3}, {4, 5, 6} };
        int[][] secondMatrix = { {7, 8}, {9, 10}, {11, 12} };
        int suma;
        if (firstMatrix[0].length == secondMatrix.length){
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
