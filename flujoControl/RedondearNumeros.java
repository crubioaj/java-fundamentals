package flujoControl;
public class RedondearNumeros{
    public static void main(String[] args) {
        double numero = 12345.27263;
        int n = 5;
        int decimales = 2; // Redondear a 2 decimales
        // Método 1: multiplicar, redondear, dividir
        double factor = Math.pow(10, decimales);
        System.out.println(Math.round(numero * factor) / factor);
        // Metodo 2
        System.out.printf("%.2f", numero);
    }
}