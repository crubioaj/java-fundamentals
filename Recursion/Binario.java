package Recursion;
public class Binario {
    private static String decimal_binario(int numeroDecimal){
        if (numeroDecimal == 1) return "1";
        else if (numeroDecimal == 0) return "0";
        return decimal_binario(numeroDecimal / 2) + (String.valueOf(numeroDecimal % 2));
    }
    private static int binario_decimal(String numeroBinario, int pos){
        int n = numeroBinario.length()-1;
        if (pos==0) return ((int) numeroBinario.charAt(0) - '0') * ((int) Math.pow(2,n));
        return binario_decimal(numeroBinario, pos-1)+(((int) numeroBinario.charAt(pos) - '0') * ((int) Math.pow(2,n-pos)));
    }
    public static void main(String[] args){
        int numeroDecimal = 13;
        String numeroBinario = decimal_binario(numeroDecimal);
        System.out.println(numeroBinario);
        System.out.println(binario_decimal(numeroBinario,numeroBinario.length()-1));
    }

}
