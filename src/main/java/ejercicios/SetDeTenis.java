package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        
         if ((numVictoriasA - numVictoriasB) > 2 || numVictoriasA < 0 || numVictoriasB < 0 || numVictoriasA > 7 || numVictoriasB > 7) {
            return "Inválido";
        } else if ((numVictoriasA >= 6 && numVictoriasA - numVictoriasB >= 2) || (numVictoriasA == 7 && numVictoriasB == 6)) {
            return "El ganador es el jugador A";
        } else if ((numVictoriasB >= 6 && numVictoriasB - numVictoriasA >= 2) || (numVictoriasB == 7 && numVictoriasA == 6)) {
            return "El ganador es el jugador B";
        } else {
            return "El set todavía no termina";
        }
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
     
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
        }
    }
