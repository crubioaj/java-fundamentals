package algebralineal;
import java.util.Arrays;

//mostrar solo los valores correctos. (crear una lista de tamaño variable)

public class RemoverDuplicados {
    private static boolean elementoexiste(int[] lista, int numero){
        for(int i:lista){
            if (i==numero) return true;
        } return false;
    }
    public static void main(String[] args) {
        int[] lista = {5,6,4,7,3,2,9,1,8,5,2,4,6,7,8,4,5,3,6,7,2,9,5,3,4};
        int[] newlista = new int[lista.length];
        int c=0;
        for(int i:lista){
            if(elementoexiste(newlista, i)){
                continue;
            }else{
                newlista[c] = i;
                c++;
            }            
        }
        System.out.println(Arrays.toString(newlista));
    }
}
