package mx.iteso.factory.pozoles.Ingredients;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleIngedient;

/**
 * Created by felipe on 10/8/16.
 */
public class Oregano extends PozoleIngedient {

    public Oregano(Pozole posoze) {
        this.pozole = posoze;
        name = "Oregano";
    }
}
