package flujoControl;
public class DesviacionEstandar {
    public static void main(String[] args){
        double[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double sum=0.0;
        for(double i:array){
            sum+=i;
        }
        double media = sum/array.length;
        double sum1=0.0;
        for(double i:array){
            sum1+=Math.pow(i-media,2);
        }
        System.out.println(Math.sqrt(sum1/array.length));
    }
}
