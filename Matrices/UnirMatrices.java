package Matrices;
import java.util.Arrays;

public class UnirMatrices {
    public static void main(String[] args){
        int[][] array1 = {{1, 2, 3},{5, 6, 7}};
        int[][] array2 = {{4, 5, 6},{8, 9, 10}};
        int[][] unir = new int[array1.length][array1[0].length+array2[0].length];
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2[i].length;j++){
                unir[i][j] = array1[i][j];
                unir[i][unir[i].length-(1+j)] = array2[i][array2.length-j];
            }
        }

        System.out.println(Arrays.deepToString(unir));
    }
}
