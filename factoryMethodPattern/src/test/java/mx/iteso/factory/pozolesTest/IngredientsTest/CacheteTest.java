package mx.iteso.factory.pozolesTest.IngredientsTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.Ingredients.Cachete;
import mx.iteso.factory.pozoles.Menudo;
import mx.iteso.factory.pozoles.PozoleIngedient;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Diego on 08/10/2016.
 */
public class CacheteTest {
    @Test
    public void IngredientTest(){
        Pozole menudo = new Menudo();
        PozoleIngedient ingedient = new Cachete(menudo);
        assertEquals("Menudo de Caldo Rojo con Cachete",ingedient.getName());
    }
}
