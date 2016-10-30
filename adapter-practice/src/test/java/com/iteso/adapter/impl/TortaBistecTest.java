package com.iteso.adapter.impl;

import com.iteso.adapter.Torta;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by rvillalobos on 11/16/14.
 */
public class TortaBistecTest  {

    Torta test;

    @Before
    public void setup () {
        test = new TortaBistec();
    }

    @Test
    public void cutByHalf() {
        assertEquals ("Take a bread and cut it by half", test.cutByHalf());
    }

    @Test
    public void fill() {
        assertEquals ("Take the bottom half and fill it with Bistec", test.fill());
    }

    @Test
    public void cover() {
        assertEquals ("Put the top of the bread", test.cover());
    }

    @Test
    public void printDescription() {
        assertEquals ("Bistec Torta", test.printDescription());
    }
}
