package proyectosBasicos;
import java.util.Arrays;

public class GenerarTrianguloPascal {
    public static void main(String[] args) {
        int filas = 6;
        //estas hacen todo el calculo
        int[] fila;
        int[] filasiguiente = null;
        //estas son solo para imprimir
        String[][] triangulo = new String[filas][]; 
        int[] tamaño = new int[filas];
        for (int i=0;i<filas;i++){
            fila = new int[i+1];
            for (int j=0;j<=i;j++){
                if(j==0 || j==i) fila[j] = 1;
                else {
                    fila[j] = filasiguiente[j-1]+filasiguiente[j];
                }
            }
            // Guardar para siguiente iteración
            filasiguiente = Arrays.copyOf(fila, i + 1);
            
            // Convertir a Strings
            final int f = i;
            final int[] filacopia = Arrays.copyOf(fila, i + 1);
            triangulo[i] = new String[i + 1];
            Arrays.setAll(triangulo[f], k -> String.valueOf(filacopia[k]));
            
            // Array para guardar tamaños de esta fila
            tamaño[i] = Arrays.stream(triangulo[i]).mapToInt(String::length).sum()+i;  //esta linea no la entiendo, repasar
            //System.out.println(Arrays.toString(fila));
        }

        int centro = tamaño[filas-1]/2;
        String filap;
        for(int i=0;i<filas;i++){
            filap="";
            for(int j=0;j<centro;j++){
                filap+=" ";
            }
            for(String l: triangulo[i]){
                filap+=l+" ";
            }
            if(i!=filas-1) centro-=(tamaño[i+1]-tamaño[i])/2;
            else centro = 0;
            System.out.println(filap);
        }
    }
}
