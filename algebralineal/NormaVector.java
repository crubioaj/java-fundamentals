package algebralineal;
import java.util.Scanner;
public class NormaVector {
    //Dado un vector v de números reales de longitud n, calcula su norma euclidiana.
    // : sqrt(v[0]^2 + v[1]^2 + ... + v[n-1]^2)
    private static double sumaCuadradosRecursiva(int n, double[] vector){
        if (n<0) return 0.0;
        return vector[n]*vector[n]+(sumaCuadradosRecursiva(n-1,vector));
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        double[] vector = new double[n];
        for (int i = 0;i<n;i++){
            vector[i] = entrada.nextDouble();
        }
        System.out.println(Math.sqrt(NormaVector.sumaCuadradosRecursiva(n-1,vector)));
    }
}
