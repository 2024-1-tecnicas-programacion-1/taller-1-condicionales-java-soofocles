
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;
import java.time.LocalDate;
/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
     // Obtener la fecha actual
        LocalDate currentDate = LocalDate.now();
        int diaActual = currentDate.getDayOfMonth();
        int mesActual = currentDate.getMonthValue();
        int annoActual = currentDate.getYear();

        // Calcular la edad
        int edad = annoActual - anno;

        // Ajustar la edad si el cumpleaños aún no ha pasado este año
        if (mesActual < mes || (mesActual == mes && diaActual < dia)) {
            edad--;
        }

        // Imprimir la edad
        String resultado = "Usted tiene " + edad + " años";
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
