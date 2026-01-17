package proyectosBasicos;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Tres_en_linea{
    private static void imprimir_tablero(String[][] tablero){
        int c=1;
        System.out.println("\n     1    2    3");
        for (String[] i: tablero){
            System.out.print(" "+c+" ");
            for (String j: i){
                System.out.print("[ "+j+" ]");
            }
            c+=1;
            System.out.println();
        }
        System.out.println();
    }

    private static String[] eliminar_jugada(String[] jugadas, String fila, String columna){
        String[] jugadas_posibles = new String[jugadas.length-1];
        String jugadaAEliminar = fila+""+columna;
        int c = 0;
        for (String movimiento: jugadas){
            if (!movimiento.equals(jugadaAEliminar)){
                jugadas_posibles[c] = movimiento;
                c++;
            }
        }
        return jugadas_posibles;
    }

    private static boolean determinar_ganador(String[][] tablero){
        String[] posibles_ganadores = {"000102","001020","101112","011121","202122","021222","001122","021120"};
        for (String jugada: posibles_ganadores){
            int a1 = jugada.charAt(0)-'0';
            int a2 = jugada.charAt(1)-'0';
            int a3 = jugada.charAt(2)-'0';
            int a4 = jugada.charAt(3)-'0';
            int a5 = jugada.charAt(4)-'0';
            int a6 = jugada.charAt(5)-'0';
            if (!tablero[a1][a2].equals(" ") && !tablero[a3][a4].equals(" ") && !tablero[a5][a6].equals(" ") && tablero[a1][a2].equals(tablero[a3][a4]) && tablero[a3][a4].equals(tablero[a5][a6])) {
                return true;
            }
        }
        return false;
    }

    private static boolean permitir_jugada(String[] jugadas, int fila, int columna){
        String jugada = fila+""+columna;
        for (String j:jugadas){
            if(j.equals(jugada)) return true;
        }return false;
    }

    public static void main(String[] args){
        String[][] tablero = new String[3][3];
        String humano = "";
        for (String[] fila: tablero){
            Arrays.fill(fila," ");
        }

        Scanner entrada = new Scanner(System.in);

        do{
            System.out.print("=== SELECCIONA CON QUE JUGARAS X o O: === ");
            humano = entrada.next();
            if (!humano.equals("X") && !humano.equals("x") & !humano.equals("O") && !humano.equals("o")) System.out.println("Entrada no valida");
        }while(!humano.equals("X") && !humano.equals("x") & !humano.equals("O") && !humano.equals("o"));

        String IA = "";
        String[] jugadas_posibles = {"11","12","13","21","22","23","31","32","33"};
        int jugada = 0;  

        switch (humano) {
            case "X":
                IA = "O";
                break;
            case "x":
                IA = "o";
                break;
            case "O":
                IA = "X";
                break;
            case "o":
                IA = "x";
                break;
            default:
                System.out.println("Entrada no valida");
                break;
        }
        
        int turno = (int)(Math.random()*2);
        int fila = 0;
        int columna = 0;

        while(!determinar_ganador(tablero)){
            imprimir_tablero(tablero);
            if (jugada%2==turno){
                boolean datosValidos = false;
                do {
                    try {
                        System.out.println("=== TURNO DEL JUGADOR ===");
                        boolean filaValida = false;
                        do {
                            try {
                                System.out.print(" Ingresa la fila donde quieras poner tu ficha: ");
                                fila = entrada.nextInt();
                                if (fila >= 1 && fila <= 3) {
                                    filaValida = true;
                                } else {
                                    System.out.println(" La fila debe ser entre 1-3");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println(" Debes ingresar un número entero");
                                entrada.nextLine();
                            }
                        } while (!filaValida);

                        boolean columnaValida = false;
                        do {
                            try {
                                System.out.print("Ingresa la columna donde quieras poner tu ficha: ");
                                columna = entrada.nextInt();
                                if (columna >= 1 && columna <= 3) {
                                    columnaValida = true;
                                } else {
                                    System.out.println("La columna debe ser entre 1 y 3");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes ingresar un número entero");
                                entrada.nextLine();
                            }
                        } while (!columnaValida);
                        
                        boolean posicionOcupada = permitir_jugada(jugadas_posibles, fila, columna);
                        
                        if (!posicionOcupada) {
                            System.out.println("Esa posición ya está ocupada. Intenta nuevamente.");
                            datosValidos = false;
                        } else {;
                            datosValidos = true;
                            tablero[fila-1][columna-1] = humano;
                        }
                    } catch (Exception e) {
                        System.out.println("ERROR inesperado: " + e.getMessage());
                        entrada.nextLine();
                        datosValidos = false;
                    }
                    
                } while (!datosValidos);
            }else{
                System.out.println("=== TURNO DE LA IA ===");
                int movimiento = (int) (Math.random() * (jugadas_posibles.length));
                fila = Integer.parseInt(jugadas_posibles[movimiento].substring(0, 1));
                columna = Integer.parseInt(jugadas_posibles[movimiento].substring(1, 2));
                tablero[fila-1][columna-1] = IA;
            }
            jugadas_posibles = eliminar_jugada(jugadas_posibles, String.valueOf(fila), String.valueOf(columna));
            if (jugadas_posibles.length == 0) break;
            jugada++;
        }

        if (jugadas_posibles.length == 0){
            System.out.println("=== EL JUEGO TERMINA EN EMPATE ===");
        }else{
            imprimir_tablero(tablero);
            System.out.println("=== TENEMOS UN GANADOR ===");
        }
        entrada.close();
    }
}