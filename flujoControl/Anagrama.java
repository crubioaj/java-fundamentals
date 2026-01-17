package flujoControl;
//no cuenta cantidad de letras, no lo tiene en cuenta
public class Anagrama {
    private static boolean contieneletra(String palabra, char c){
        for (char i : palabra.toCharArray()) {
            if(i == c) return true;
        }
        return false;
    }
    private static boolean anagrama(String palabra1, String palabra2){
        if(palabra1.length() == palabra2.length()){
            for (char c : palabra1.toCharArray()) {
                if(!contieneletra(palabra2,c)){
                    return false;
                }
            }
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String palabra1 = "amor", palabra2 = "roma";
        if(anagrama(palabra1,palabra2) && anagrama(palabra2,palabra1)){
            System.out.println("si es un anagrama");
        }else{
            System.out.println("no es un anagrama");
        }
    }
}
