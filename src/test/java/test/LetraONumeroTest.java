package test;

import ejercicios.LetraONumero;
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
public class LetraONumeroTest {
    @Test
    public void testEsNumero() {
        String valorEsperado = "Es número";
        String valorActual = LetraONumero.evaluar('4');
        assertEquals(valorEsperado, valorActual);
    }
     @Test
    public void testEsLetraMayuscula() {
        String valorEsperado = "Es letra mayúscula";
        String valorActual = LetraONumero.evaluar('A');
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testEsLetraMinuscula() {
        String valorEsperado = "Es letra minúscula";
        String valorActual = LetraONumero.evaluar('f');
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testNoEsLetraNiNumero() {
        String valorEsperado = "No es letra ni número";
        String valorActual = LetraONumero.evaluar('#');
        assertEquals(valorEsperado, valorActual);
    }
    
}
