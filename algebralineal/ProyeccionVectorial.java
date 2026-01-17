package algebralineal;
import java.util.Scanner;
public class ProyeccionVectorial {
    //Dados dos vectores u y v, calcula la proyección escalar del vector u sobre v.
    //(productoEscalar(u, v) / productoEscalar(v, v))
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la dimensión de los vectores: ");
        int n = entrada.nextInt();
        System.out.println("Ingrese los " + n + " elementos del vector u:");
        double[] u = new double[n];
        ProductoEscalar.crearvector(u,entrada);
        System.out.println("Ingrese los " + n + " elementos del vector v:");
        double[] v = new double[n];
        ProductoEscalar.crearvector(v,entrada);

        System.out.println(ProductoEscalar.productoEscalar(u,v)/ProductoEscalar.productoEscalar(v, v));
    }
}
