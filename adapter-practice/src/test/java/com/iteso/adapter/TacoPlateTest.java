package com.iteso.adapter;

import com.iteso.adapter.impl.TacoLengua;
import com.iteso.adapter.impl.TortaAdapter;
import com.iteso.adapter.impl.TortaBistec;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by felipe on 10/29/16.
 */
public class TacoPlateTest {
    TacoPlate plate;

    @Before
    public void setup () {
        plate = new TacoPlate();
    }

    @Test
    public void addNormal() {
        plate.addTaco(new TacoLengua());
        assertEquals ("Take a tortilla and fill it with Lengua" +
                "Fold the tortilla" +
                "Lengua Taco", plate.servePlate());
    }

    @Test
    public void addAdapted () {
        Taco torta = new TortaAdapter(new TortaBistec());
        plate.addTaco(torta);
        assertEquals("Take a bread and cut it by half" +
                "Take the bottom half and fill it with Bistec" +
                "Put the top of the bread" +
                "Bistec Torta",plate.servePlate());
    }
}
