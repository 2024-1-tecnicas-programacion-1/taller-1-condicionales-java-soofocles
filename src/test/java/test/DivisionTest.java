package test;

import ejercicios.Division;
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
public class DivisionTest {
    @Test
    public void testDivisionExacta() {
        String valorEsperado = "La división es exacta.\n"
                + "Cociente: 9\n"
                + "Residuo: 0";
        String valorActual = Division.evaluar(45, 5);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test                                        
    public void testDivisionNoExacta() {
        String valorEsperado1 = "La división no es exacta.\n"
                                + "Cociente: 4\n"
                                + "Residuo: 1";
        String valorActual1 = Division.evaluar(13, 3);
        assertEquals(valorEsperado1, valorActual1);
        
    }
}
