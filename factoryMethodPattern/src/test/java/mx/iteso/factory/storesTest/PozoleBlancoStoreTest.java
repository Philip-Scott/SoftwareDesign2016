package mx.iteso.factory.storesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.PozoleBlancoStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Diego on 08/10/2016.
 */
public class PozoleBlancoStoreTest {
    @Test
    public void createPozoleTest(){
        PozoleStore menuderia = new PozoleBlancoStore();
        Pozole pozole = menuderia.orderPozole("pollo");
        assertEquals("Pozole de Caldo Blanco con Pollo con Cebolla con Lechuga con Rabanos",pozole.getName());

    }
}
