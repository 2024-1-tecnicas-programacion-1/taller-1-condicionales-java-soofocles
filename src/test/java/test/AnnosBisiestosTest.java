package test;

import ejercicios.AnnosBisiestos;
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
public class AnnosBisiestosTest {
    @Test
    public void testAnoBisiesto() {
        
        String valorEsperado1988 = "1988 es bisiesto";
        String valorActual1988 = AnnosBisiestos.evaluar(1988);
        assertEquals(valorEsperado1988, valorActual1988);
    }
    
    @Test    
    public void testAnoNoBisiesto() {
        String valorEsperado1900 = "1900 no es bisiesto";
        String valorActual1900 = AnnosBisiestos.evaluar(1900);
        assertEquals(valorEsperado1900, valorActual1900);
    }
}
