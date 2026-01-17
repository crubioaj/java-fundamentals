package algebralineal;
import java.util.Scanner;
public class ProductoEscalar {
    //Dados dos vectores a y b de la misma longitud n, calcula su producto escalar.
    // : a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1]
    protected static void crearvector(double[] vector, Scanner entrada){
        //dado que los arreglos son objetos un cambio en un metodo los afecta
        for (int i=0; i<vector.length;i++){
            vector[i] = entrada.nextDouble();
        }
    } 
    protected static double productoEscalar(double[] a, double[] b){
        double resultado = 0;
        for(int i=0;i<a.length;i++){
            resultado+=a[i]*b[i];
        }
        return resultado;
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        double[] a = new double[n];
        double[] b = new double[n];
        System.out.println("primer arreglo");
        crearvector(a, entrada);
        System.out.println("segundo arreglo");
        crearvector(b, entrada);
        double resultado = productoEscalar(a, b);
        System.out.println(resultado);
    }
}
