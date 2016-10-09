package mx.iteso.factory.pozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.Ingredients.Aguacate;
import mx.iteso.factory.pozoles.Menudo;
import mx.iteso.factory.pozoles.PozoleIngedient;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PozoleIngedientTest {

        @Test
        public void IngredientTest(){
            Pozole menudo = new Menudo();
            PozoleIngedient ingedient = new Aguacate(menudo);
            assertEquals("Menudo de Caldo Rojo con Aguacate",ingedient.getName());
            assertEquals("Preparing Menudo\nAdding corn kernels...\nAdding broth & toppings...\nCaldo Rojo, Aguacate",ingedient.prepare());
        }

}
