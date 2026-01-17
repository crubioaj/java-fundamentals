package bucles;
public class DescomposicionSumaPrimos{
    public static boolean primo(int numero){
        if (numero <= 1) return false;
        if (numero <= 3) return true;
        if (numero % 2 == 0 || numero % 3 == 0) return false;
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        int numero = 34;
        int k = 1;
        if (primo(numero-2)) System.out.println(numero+" = "+2+" + "+(numero-2));
        if (primo(numero-3)) System.out.println(numero+" = "+3+" + "+(numero-3));
        
        while(6*k-1 <= numero/2){
            int candidato1 = 6 * k - 1;
            int candidato2 = 6 * k + 1;
            if (primo(candidato1) && primo(numero - candidato1)) {
                System.out.println(numero + " = " + candidato1 + " + " + (numero - candidato1));
            }
            if (candidato2 <= numero / 2 && primo(candidato2) && primo(numero - candidato2)) {
                System.out.println(numero + " = " + candidato2 + " + " + (numero - candidato2));
            }
            k++;
        }
    }
}  