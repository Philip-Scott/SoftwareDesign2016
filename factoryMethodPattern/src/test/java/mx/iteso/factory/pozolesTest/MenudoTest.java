package mx.iteso.factory.pozolesTest;
import mx.iteso.factory.Pozole;
import static org.mockito.Mockito.*;

import mx.iteso.factory.pozoles.Menudo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MenudoTest {
    @Test
    public void serverTest(){
        Pozole menudo = new Menudo();
        assertEquals("Menudo de Caldo Rojo",menudo.getName());
        assertEquals("Serving xtra hot in special menudo plate...",menudo.serve());
    }

}
