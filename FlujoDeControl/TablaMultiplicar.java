package FlujoDeControl;
public class TablaMultiplicar {
    public static void main(String[] args) {
        for(int i = 1;i<=9;i+=2){
            for(int j = 1;j<=10;j++){
                System.out.printf("%d * %d = %d \t %d * %d = %d \n",i,j,i*j,i+1,j,((i+1)*j));
            }
            System.out.println();
        }
    }
}
