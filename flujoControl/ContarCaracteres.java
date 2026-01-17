package flujoControl;

public class ContarCaracteres {
    private static boolean caracterExiste(char[] caracteres, char c){
        for(char i:caracteres){
            if(i==c) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String palabra = "Astronauta";
        char[] letras = palabra.toLowerCase().toCharArray();
        char[] letrasQuePasaron = new char[letras.length];
        int contador;
        for(int l=0;l<letras.length;l++){
            char letra = letras[l];
            contador=0;
            for(char i: letras){
                if((i == letra) && !caracterExiste(letrasQuePasaron, letra)) contador+=1;
            }
            letrasQuePasaron[l] = letra;
            if(contador!=0){
                System.out.println(letra+" : "+contador);
            }
        }
    }
}
