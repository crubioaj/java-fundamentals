package algebralineal;

//Mejorarlo ampliar el algoritmo para hacerlo mas completo

import java.util.Arrays;

public class GaussJordan {
    private static int determinarPivote(double[][] matrix, int etapa){
        double pivote = 0.0;
        int fila = 0;
        for(int i=etapa;i<matrix.length;i++){
            if(Math.abs(matrix[i][etapa]) > pivote){
                pivote = Math.abs(matrix[i][etapa]);
                fila = i;
            }
        }
        return fila;
    }

    private static double[] calcularnuevafila(double[][] matrix,double pivote, int etapa, int netapa){
        double[] nuevafila = new double[matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            nuevafila[i] = Math.round((pivote*matrix[etapa][i]+matrix[netapa][i])*100.0)/100.0;
        }
        return nuevafila;
    }

    private static double[] sustitucionRegresiva(double[][] matrix){
        double[] respuestas = new double[matrix[0].length-1];
        Arrays.fill(respuestas,1.0);
        double suma = 0.0;
        for(int i = matrix.length-1; i>=0; i--){
            suma = 0.0;
            for(int j = 0; j<matrix[i].length-1;j++){
                if(j!=i){
                    suma+=matrix[i][j]*respuestas[j];
                }
            }
            respuestas[i] = Math.round(((matrix[i][matrix[i].length-1]-suma)/matrix[i][i])*100.0)/100.0;
        }
        return respuestas;
    }

    private static double[][] gaussJordan(double[][] matrix){
        double[] nuevafila = {};
        double pivote;
        int filapivote;
        double npivote;
        for(int etapa=0;etapa<matrix.length-1;etapa++){
            //Intercambia filas para que el número más grande de la columna quede en la diagonal principal antes de eliminar.
            filapivote = determinarPivote(matrix, etapa);
            pivote = matrix[filapivote][etapa];
            nuevafila = matrix[etapa];
            matrix[etapa] = matrix[filapivote];
            matrix[filapivote] = nuevafila;
            
            //Calculas los multiplicadores y con ellos transformas las demás filas para hacer ceros debajo del pivote.
            for(int netapa=etapa+1;netapa<matrix.length;netapa++){
                npivote = -1*matrix[netapa][etapa]/pivote;
                matrix[netapa] = calcularnuevafila(matrix,npivote,etapa,netapa);
            }
        }
        return matrix;
    }

    public static void main(String[] args){
        double[][] matrix = {{2,  1,  5},{1, -3, -7}};
        //double[][] matrix = {{8,2,-2,-2},{10,2,4,4},{12,2,2,6}};
        //double[][] matrix = {{1, 1, 1, 6},{2, 1, 3, 14},{1, 2, 1, 8}};
        //double[][] matrix = {{1, 1, 2},{1, 1, 3}};

        double[][] gauss = gaussJordan(matrix);
        double[] respuestas = sustitucionRegresiva(gauss);
        System.out.println(Arrays.deepToString(gauss));
        System.out.println(Arrays.toString(respuestas));
    }
}
