package mx.iteso.factory.storesTest;
import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.MenudoStore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Diego on 08/10/2016.
 */
public class MenudoStoreTest {

    @Test
    public void createPozoleTest(){
        PozoleStore menuderia = new MenudoStore();
        Pozole pozole = menuderia.orderPozole("pollo");
        assertEquals("Menudo de Caldo Rojo con Pollo con Cebolla con Col",pozole.getName());

    }
}
