package Bucles;
public class Piramides {
    public static void main(String[] args) {
        String fila;
        for (int i=1;i<=5;i++){
            fila = "";
            for (int j=1;j<=i;j++){
                fila+="* ";
            }
            System.out.println(fila);
        }
        for (int i=1;i<=5;i++){
            fila = "";
            for (int j=1;j<=i;j++){
                fila+=j+" ";
            }
            System.out.println(fila);
        }
        for (int i=1;i<=5;i++){
            fila = "";
            for (int j=1;j<=i;j++){
                fila+=(char)(64+i)+" ";
            }
            System.out.println(fila);
        }
        for (int i=5;i>=1;i--){
            fila = "";
            for (int j=1;j<=i;j++){
                fila+="* ";
            }
            System.out.println(fila);
        }
        for (int i=5;i>=1;i--){
            fila = "";
            for (int j=1;j<=i;j++){
                fila+=j+" ";
            }
            System.out.println(fila);
        }
        int k=5;
        for (int i=5;i>=1;i--){
            fila = "";
            for (int j=1;j<=9;j++){
                if(j==i) fila+="* ";
                else if (j>i && j<=k) fila+="* ";
                else fila+="  ";
            }
            k+=1;
            System.out.println(fila);
        }
        k=5;
        int c = 1; 
        for (int i=5;i>=1;i--){
            fila = "";
            for (int j=1;j<=9;j++){
                if(j==5) fila+=c+" ";
                else if ((j>5 && j<=k) || (j<5 && j>(9-k))) fila+=c-Math.abs(5-j)+" ";
                else fila+="  ";
            }
            c+=2;
            k+=1;
            System.out.println(fila);
        }
        k=9;
        for (int i=1;i<=5;i++){
            fila = "";
            for (int j=1;j<=9;j++){
                if(j==i) fila+="* ";
                else if (j>i && j<=k) fila+="* ";
                else fila+="  ";
            }
            k--;
            System.out.println(fila);
        }
        c=1;
        for(int i=1;i<=4;i++){
            fila = "";
            for(int j=1;j<=i;j++){
                fila+=c+(j-1)+" ";
            }
            c+=i;
            System.out.println(fila);
        }
    }
}
