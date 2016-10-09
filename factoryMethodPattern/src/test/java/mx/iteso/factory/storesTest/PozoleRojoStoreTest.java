package mx.iteso.factory.storesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.PozoleRojoStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Diego on 08/10/2016.
 */
public class PozoleRojoStoreTest {
    @Test
    public void createPozoleTest(){
        PozoleStore menuderia = new PozoleRojoStore();
        Pozole pozole = menuderia.orderPozole("pollo");
        assertEquals("Pozole de Caldo Rojo con Pollo con Oregano con Rabanos con Col",pozole.getName());

    }
}
