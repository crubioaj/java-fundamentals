package Bucles;
public class Piramidesv2 {
    public static void main(String[] args) {
        String fila;
        int k = 5;
        for(int i=1;i<=5;i++){
            fila="";
            for(int j=1;j<=9;j++){
                if(j<k || (j>9-(k-1))) fila+=" ";
                else fila+="*";
            }
            k--;
            System.out.println(fila);
        }
        System.out.println();
        k = 1;
        for(int i=1;i<=5;i++){
            fila="";
            for(int j=9;j>=1;j--){
                if(j<k || (j>9-(k-1))) fila+=" ";
                else fila+="*";
            }
            k++;
            System.out.println(fila);
        }
        System.out.println();
        k = 5;
        boolean mod = false;
        for(int i=1;i<=9;i++){
            fila="";
            for(int j=1;j<=9;j++){
                if(j<k || (j>9-(k-1))) fila+=" ";
                else fila+="*";
            }
            if (k==1) mod=true;
            if (mod) k++;
            else k--;
            System.out.println(fila);
        }
        System.out.println();
        k = 4;
        for(int i=1;i<=5;i++){
            fila="";
            for(int j=0;j<=7;j++){
                if (j==k || j==7-(k-1) || i==5) fila+="*";
                else fila+=" ";
            }
            k--;
            if(i==5) fila+="*";
            System.out.println(fila);
        }
        System.out.println();
        k = 5;
        for(int i=1;i<=5;i++){
            fila="";
            for(int j=1;j<=5;j++){
                if(j<k) fila+=" ";
                else fila+="*";
            }
            k--;
            System.out.println(fila);
        }
        System.out.println();
        k = 0;
        for(int i=1;i<=5;i++){
            fila="";
            for(int j=0;j<5;j++){
                if(j==k || j==4-k) fila+="*";
                else fila+=" ";
            }
            k++;
            System.out.println(fila);
        }
        System.out.println();
        for(int i=1;i<=5;i++){
            fila="";
            for(int j=0;j<5;j++){
                fila+="*";
            }
            k++;
            System.out.println(fila);
        }
        System.out.println();
        k=5;
        for(int i=1;i<=5;i++){
            fila="";
            for(int j=0;j<5;j++){
                if(j<k)fila+="*";
                else fila+=" ";
            }
            k--;
            System.out.println(fila);
        }
        System.out.println();
        k=4;
        for(int i=1;i<=9;i++){
            fila="";
            for(int j=1;j<=9;j++){
                if(j==(9-k) || j==(k+1)) fila+="*";
                else fila+=" ";
            }
            if(i<5) k--;
            else k++;
            System.out.println(fila);
        }
        System.out.println();
        k=9;
        for(int i=1;i<=9;i++){
            fila="";
            for(int j=1;j<=10;j++){
                if(j<=(10-k) || j>=(k+1)) fila+="*";
                else fila+=" ";
            }
            if(i<5) k--;
            else k++;
            System.out.println(fila);
        }
        System.out.println();
        k=2;
        for(int i=1;i<=5;i++){
            fila="";
            for(int j=1;j<=5;j++){
                if(j<k) fila+="*";
                else fila+=" ";
            }
            k++;
            System.out.println(fila);
        }
        System.out.println();
        for(int i=1;i<=5;i++){
            fila="";
            for(int j=1;j<=5;j++){
                if(i==1 || i==5 || j==1 || j==5) fila+="*";
                else fila+=" ";
            }
            System.out.println(fila);
        }
        System.out.println();
        k=2;
        for(int i=1;i<=9;i++){
            fila="";
            for(int j=1;j<=5;j++){
                if(j<k) fila+="*";
                else fila+=" ";
            }
            if(i<5) k++;
            else k--;
            System.out.println(fila);
        }
        //corazon
        System.out.println();
        k=1;
        for(int i=1;i<=8;i++){
            fila="";
            for(int j=1;j<=15;j++){
                if(((k<j && j<8-k) || (j>8+k && j<=15-k)) && i<=3) fila+="*";
                else if (i>3 && (j>k && j<=15-k)) fila+="*";
                else fila+=" "; 
            }
            if (i<3) k--;
            else k+=2;
            System.out.println(fila);
        }
        //pentagrama
        for(int i=1;i<=12;i++){
            fila="";
            for(int j=1;j<=25;j++){
                if ((i <= 4) && (j == (13 - (i - 1)) || j == (13 + (i - 1)))) fila += "*";
                else if(i==5 && j%2!=0) fila+="*";
                else if(i==6 && (j==3 || j==23 || j==9 || j==17)) fila+="*";
                else if(i==7 && (j==8 || j==18 || j==5 || j==21)) fila+="*";
                else if(i==8 && (j==7 || j==10 || j==16 || j==19)) fila+="*";
                else if(i==9 && (j==6 || j==13 || j==20)) fila+="*";
                else if(i==10 && (j==5 || j==9 || j==17 || j==21)) fila+="*";
                else if(i==11 && (j==4 || j==6 || j==20 || j==22)) fila+="*";
                else if(i==12 && (j==3 || j==23)) fila+="*";
                else fila+=" ";
            }
            System.out.println(fila);
        }
    }
}
