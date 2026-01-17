package algebralineal;

public class DeterminanteMatrizCofactores {
    private static double[][] transpuesta(double[][] matriz){
        double[][] newmatriz = new double[matriz.length][matriz.length];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                newmatriz[j][i] = matriz[i][j];
            }
        }
        return newmatriz;
    }

    private static int determinarmasceros(double[][] matriz){
        int max = 0;
        int fila = 0;
        for(int i=0;i<matriz.length;i++){
            int ceros = 0;
            for(int j=0;j<matriz.length;j++){
                if(matriz[i][j] == 0.0){
                    ceros+=1;
                }
            }
            if(ceros>max){
                max = ceros;
                fila = i;
            }
        }
        return fila;
    }

    private static double[][] submatriz(double[][] matriz, int fila, int columna){
        int n = matriz.length;
        double[][] submatriz = new double[n-1][n-1];
        int fil = 0, col;
        for(int i=0;i<n;i++){
            col = 0;
            for(int j=0;j<n;j++){
                if(j != columna && i != fila){
                    submatriz[fil][col] = matriz[i][j];
                    col++;
                } 
            }if (i!=fila) fil++;
        }
        return submatriz;
    }

    private static double determinante(double[][] matriz){
        if(matriz.length == 1) return matriz[0][0];
        if(matriz.length == 2) return (matriz[0][0]*matriz[1][1])-(matriz[0][1]*matriz[1][0]);
        double suma = 0;
        //determinar por filas
        // int fila = determinarmasceros(matriz);
        // for (int j = 0; j < matriz.length; j++){
        //     if(matriz[fila][j] != 0.0){
        //         suma += matriz[fila][j] * Math.pow(-1, fila + j) * determinante(submatriz(matriz, fila, j));
        //     }
        // }

        //determinar por columnas
        int colum = determinarmasceros(transpuesta(matriz));
        for (int i = 0; i < matriz.length; i++){
            if(matriz[i][colum] != 0.0){
                suma += matriz[i][colum] * Math.pow(-1, colum + i) * determinante(submatriz(matriz, i, colum));
            }
        }

        return suma;
    }

    public static void main(String[] args){
        double[][] matriz1 = {{1,4,0,0},{2,3,0,1},{0,4,1,5},{0,0,2,3}};
        System.out.println("Matriz 1 (tu ejemplo): " + determinante(matriz1) + " (esperado: 43)");

        double[][] matriz2 = {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
        System.out.println("Matriz 2 (identidad 4x4): " + determinante(matriz2) + " (esperado: 1)");

        double[][] matriz3 = {{1,2,3,4},{2,4,6,8},{5,6,7,8},{9,10,11,12}};
        System.out.println("Matriz 3 (determinante 0): " + determinante(matriz3) + " (esperado: 0)");

        double[][] matriz4 = {{2,3,1,5},{0,4,2,1},{0,0,3,4},{0,0,0,2}};
        System.out.println("Matriz 4 (triangular superior): " + determinante(matriz4) + " (esperado: 48)");

        double[][] matriz5 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Matriz 5 (3x3 singular): " + determinante(matriz5) + " (esperado: 0)");

        double[][] matriz6 = {{0,0,0,5},{0,0,2,0},{0,3,0,0},{4,0,0,0}};
        System.out.println("Matriz 6 (antidiagonal): " + determinante(matriz6) + " (esperado: 120)");

        double[][] matriz7 = {{2,1,0,0},{1,2,1,0},{0,1,2,1},{0,0,1,2}};
        System.out.println("Matriz 7 (tridiagonal): " + determinante(matriz7) + " (esperado: 5)");

        double[][] matriz8 = {{7}};
        System.out.println("Matriz 8 (1x1): " + determinante(matriz8) + " (esperado: 7)");

        double[][] matriz9 = {{3,8},{4,6}};
        System.out.println("Matriz 9 (2x2): " + determinante(matriz9) + " (esperado: -14)");

        double[][] matriz10 = {{1,0,2,0},{0,3,0,4},{2,0,4,0},{0,6,0,8}};
        System.out.println("Matriz 10 (singular): " + determinante(matriz10) + " (esperado: 0)");
    }
}
