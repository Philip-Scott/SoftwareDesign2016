package mx.iteso.factory.storesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.PozoleVerdeStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Diego on 08/10/2016.
 */
public class PozoleVerdeStoreTest {
    @Test
    public void createPozoleTest(){
        PozoleStore menuderia = new PozoleVerdeStore();
        Pozole pozole = menuderia.orderPozole("pollo");
        assertEquals("Pozole de Caldo Verde con Pollo con Cebolla con Lechuga con Rabanos",pozole.getName());

    }
}
