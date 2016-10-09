package mx.iteso.factory.storesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.PozolilloStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Diego on 08/10/2016.
 */
public class PozolilloStoreTest {
    @Test
    public void createPozoleTest(){
        PozoleStore menuderia = new PozolilloStore();
        Pozole pozole = menuderia.orderPozole("pollo");
        assertEquals("Menudo de Caldo Verde con Pollo con Elote con Aguacate con Rabanos",pozole.getName());

    }
}
