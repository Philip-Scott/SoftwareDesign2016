package com.iteso.adapter.impl;

import com.iteso.adapter.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by rvillalobos on 11/16/14.
 */
public class TacoLenguaTest  {

    Taco test;

    @Before
    public void setup () {
        test = new TacoLengua();
    }

    @Test
    public void fill() {
        assertEquals ("Take a tortilla and fill it with Lengua", test.fill());
    }

    @Test
    public void fold() {
        assertEquals("Fold the tortilla", test.fold());
    }

    @Test
    public void printDescription() {
       assertEquals("Lengua Taco", test.printDescription());
    }
}
