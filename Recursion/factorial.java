package Recursion;
public class factorial {
    public static int factorial_recursiva(int n){
        if (n==0) return 1;
        return n*factorial_recursiva(n-1);
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println(factorial_recursiva(numero));
    }
}
