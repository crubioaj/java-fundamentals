package flujoControl;
public class RaizCuadrada {
    public static void main(String[] args){
        double a = 5, b=8, c=3;
        double discriminante = Math.pow(b,2)-4*a*c;
        if (discriminante>=0 && a!=0){
            double root1 = (-b + Math.sqrt(discriminante))/(2*a);
            double root2 = (-b - Math.sqrt(discriminante))/(2*a);
            System.out.println("las raices son: "+root1+" "+root2);
        }else{
            System.out.println("no existen raices reales");
        }
    }
}
