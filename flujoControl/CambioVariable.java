package flujoControl;

public class CambioVariable {
    public static void main(String[] args){
        int variable1 = 5, variable2 = 4;
        //char variable1 = 'a', variable2 = 'b';

        // Metodo simple
        /*
        int variabletemp;
        variabletemp = variable1;
        variable1 = variable2;
        variable2 = variabletemp;
        */
        // Metodo complejo
        /* 
        variable1 = variable1-variable2;
        variable2 = variable2+variable1;
        variable1 = variable2-variable1;
        */
        
        /*
        variable1 = (char) ((int) variable1-(int) variable2);
        variable2 = (char) ((int)variable2+(int)variable1);
        variable1 = (char) ((int)variable2-(int)variable1);
        */

        System.out.println(variable1);
        System.out.println(variable2);
    }
}
