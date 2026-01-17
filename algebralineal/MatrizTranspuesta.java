package algebralineal;
import java.util.Scanner;
import java.util.Arrays;

public class MatrizTranspuesta {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa el numero de filas");
        int m = entrada.nextInt();
        System.out.println("ingresa el numero de columnas");
        int n = entrada.nextInt();
        double[][] matrix = new double[m][n];
        double[][] transpuesta = new double[n][m];
        SumarMatrices.crearMatrix(matrix,entrada);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpuesta[j][i] = matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(transpuesta));
    }
}
