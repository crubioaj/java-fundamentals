package flujoControl;
import java.util.Scanner;
class YearBisiesto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int year = entrada.nextInt();
        if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))){
            System.out.println("el year "+year+" es bisiesto");
        }else{
            System.out.println("el year "+year+" No es bisiesto");
        }
        entrada.close();
    }
}