package test;

import ejercicios.SetDeTenis;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenisTest {
    @Test
    public void testAunNoTermina() {
        String resultadoEsperado = "El set todavía no termina";
        String resultadoActual = SetDeTenis.evaluar(4, 3);
        assertEquals(resultadoEsperado, resultadoActual);
    }
    
    @Test
    public void testGanadorA() {
        String resultadoEsperado = "El ganador es el jugador A";
        String resultadoActual = SetDeTenis.evaluar(7, 5);
        assertEquals(resultadoEsperado, resultadoActual);
    }
    
    @Test
    public void testGanadorB() {
        String resultadoEsperado = "El ganador es el jugador B";
        String resultadoActual = SetDeTenis.evaluar(3, 7);
        assertEquals(resultadoEsperado, resultadoActual);
    }
        
    @Test
    public void testInvalido() {
        String resultadoEsperado = "Inválido";
        String resultadoActual = SetDeTenis.evaluar(8, 3);
        assertEquals(resultadoEsperado, resultadoActual);
    }
}
