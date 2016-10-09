package mx.iteso.factory.pozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.Pozolillo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Diego on 08/10/2016.
 */
public class PozolilloTest {
    @Test
    public void serverTest(){
        Pozole pozolillo = new Pozolillo();
        assertEquals("Menudo de Caldo Verde",pozolillo.getName());
        assertEquals("Serving xtra hot in special pozolillo plate...",pozolillo.serve());
    }
}
