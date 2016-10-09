package mx.iteso.factory.storesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.Menudo;
import mx.iteso.factory.stores.MenudoStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Diego on 08/10/2016.
 */
public class PozoleStoreTest {
    @Test
    public void createPozoleTest(){
        PozoleStore menuderia = new MenudoStore();
        Pozole pozole = menuderia.orderPozole("pollo");
        Pozole pozole1 = menuderia.orderPozole("cachete");
        Pozole pozole2 = menuderia.orderPozole("oreja");
        Pozole pozole3 = menuderia.orderPozole("pierna");
        Pozole pozole4 = menuderia.orderPozole("trompa");
        Pozole pozole5 = menuderia.orderPozole("aguacate");
        assertEquals("Menudo de Caldo Rojo con Pollo con Cebolla con Col",pozole.getName());
        assertEquals("Menudo de Caldo Rojo con Cachete con Cebolla con Col",pozole1.getName());
        assertEquals("Menudo de Caldo Rojo con Oreja con Cebolla con Col",pozole2.getName());
        assertEquals("Menudo de Caldo Rojo con Pierna con Cebolla con Col",pozole3.getName());
        assertEquals("Menudo de Caldo Rojo con Trompa con Cebolla con Col",pozole4.getName());
        assertEquals("Menudo de Caldo Rojo con Aguacate con Cebolla con Col",pozole5.getName());
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void errorTest () {
        PozoleStore menuderia = new MenudoStore();
        Pozole pozole = menuderia.orderPozole("chocolate");
        assertEquals("Menudo de Caldo Rojo con Chocolate con Cebolla con Col",pozole.getName());
    }
}
