package mx.iteso.factory.pozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleRojo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Diego on 08/10/2016.
 */
public class PozoleRojoTest {
    @Test
    public void serverTest() {
        Pozole pozolerojo = new PozoleRojo();
        assertEquals("Pozole de Caldo Rojo", pozolerojo.getName());
    }
}
