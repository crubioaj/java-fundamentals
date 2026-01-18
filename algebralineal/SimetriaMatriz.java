package algebralineal;

public class SimetriaMatriz {
    private static boolean simetrica(double[][] matriz){
        for(int i = 0;i<matriz.length;i++){
            for(int j=0;j<=i;j++){
                if(matriz[i][j]!=matriz[j][i]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        double[][] matriz = {{1, 7, 3}, {7, 4, 5}, {3, 5, 2}};
        System.out.println(simetrica(matriz));
    }
}
