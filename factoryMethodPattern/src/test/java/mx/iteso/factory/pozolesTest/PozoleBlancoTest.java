package mx.iteso.factory.pozolesTest;


import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlanco;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PozoleBlancoTest {
    @Test
    public void serverTest() {
        Pozole pozoleblanco = new PozoleBlanco();
        assertEquals("Pozole de Caldo Blanco", pozoleblanco.getName());
    }
}
