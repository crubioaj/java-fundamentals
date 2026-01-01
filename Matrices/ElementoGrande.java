package Matrices;
public class ElementoGrande {
    public static void main(String[] args) {
        double[] array = { 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5 };
        double max = array[0];
        for(double i: array){
            if(i>max) max=i;
        }
        System.err.println(max);
    }
}
