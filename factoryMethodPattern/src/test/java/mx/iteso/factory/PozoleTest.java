package mx.iteso.factory;

import mx.iteso.factory.pozoles.Ingredients.Aguacate;
import mx.iteso.factory.pozoles.Menudo;
import mx.iteso.factory.pozoles.PozoleIngedient;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by felipe on 10/6/16.
 */
public class PozoleTest {

    @Test
    public void PrepareTest(){
        Pozole menudo = new Menudo();
        PozoleIngedient ingedient = new Aguacate(menudo);
        assertEquals("Menudo de Caldo Rojo",menudo.getTopings());
        assertEquals("Serving xtra hot in special menudo plate...",menudo.serve());
        assertEquals("Menudo de Caldo Rojo con Aguacate",ingedient.getName());
    }
}
