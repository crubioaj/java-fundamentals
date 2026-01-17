package flujoControl;
import java.util.Scanner;
public class Decimal {
    public static void main(String[] args) {
        //encontrar la cantidad de decimales de un numero decimal y redondearlo a una cantidad de decimales especifica
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa un numero decimal:");
        String numerostr = scanner.nextLine();
        int cantidadDeDecimales = numerostr.length() - (numerostr.indexOf(".")+1);
        System.out.println("El numero tiene " + cantidadDeDecimales+ " decimales.");
        System.out.println("Ingresa a cuantos decimales quieres redondear el numero:");
        int deciamles = scanner.nextInt();
        double numero = Double.parseDouble(numerostr);
        double redondeado = Math.round(numero* Math.pow(10, deciamles)) / Math.pow(10, deciamles);
        System.out.println("El numero redondeado es: " + redondeado);
        scanner.close();
    }
}
