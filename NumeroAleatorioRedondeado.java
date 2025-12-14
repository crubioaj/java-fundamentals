public class NumeroAleatorioRedondeado{
    public static void main(String[] args){
        //generar un número decimal entre 0.0 y 1.0 y muéstralo con 3 decimales.
        double numero = Math.random();
        numero = Math.round(numero*1000.0)/ 1000.0;
        System.out.println("El número aleatorio es: " + numero);
   }

}