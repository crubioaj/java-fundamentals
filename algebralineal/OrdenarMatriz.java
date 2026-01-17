package algebralineal;
import java.util.Arrays;

//copiar array sin usar array copy usando for.

public class OrdenarMatriz {
    private static int buscarMenor(int[] lista){
        int menor = lista[0];
        for (int i:lista){
            if(i<menor) menor=i;
        }
        return menor;
    }

    private static int[] reducirArray(int[] lista, int menor){
        int[] nuevaLista = new int[lista.length-1];
        int pos = -1;
        for (int i=0;i<lista.length;i++){
            if(lista[i]==menor){
                pos = i;
                break;
            }
        }
        if (pos > 0) {
            System.arraycopy(lista, 0, nuevaLista, 0, pos);
        }
        if (pos < lista.length - 1) {
        System.arraycopy(lista,pos + 1,nuevaLista,pos,lista.length - pos - 1);
        }
        return nuevaLista;
    }

    public static void main(String[] args){    
        int[] lista = {5,6,4,7,3,2,9,1,8,5};
        int[] ordenada = new int[lista.length];
        int menor = 0;
        System.out.println("Lista sin ordenar: "+Arrays.toString(lista));
        for (int i = 0; i<ordenada.length;i++){
            menor = buscarMenor(lista);
            ordenada[i] = menor;
            lista = reducirArray(lista, menor);
        }
        
        System.out.println("Lista ordenada: "+Arrays.toString(ordenada));
    }
}
