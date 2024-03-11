package test;

import ejercicios.Edad;
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
public class EdadTest {
    @Test
    public void test2000Enero1() {
        String valorEsperado = "Usted tiene 24 años";
        String valorActual = Edad.evaluar(1, 1, 2000); 
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void test2005Septiembre19() {
        String valorEsperado = "Usted tiene 18 años";
        String valorActual = Edad.evaluar(19, 9, 2005);
        assertEquals(valorEsperado, valorActual);
    }
}
