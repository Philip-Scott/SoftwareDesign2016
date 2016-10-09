package mx.iteso.factory.pozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleVerde;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Diego on 08/10/2016.
 */
public class PozoleVerdeTest {
    @Test
    public void serverTest() {
        Pozole pozoleverde = new PozoleVerde();
        assertEquals("Pozole de Caldo Verde", pozoleverde.getName());
    }
}
