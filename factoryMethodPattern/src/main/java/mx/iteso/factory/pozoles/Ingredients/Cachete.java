package mx.iteso.factory.pozoles.Ingredients;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleIngedient;

/**
 * Created by felipe on 10/6/16.
 */
public class Cachete extends PozoleIngedient {

    public Cachete (Pozole posoze) {
        this.pozole = posoze;
        name = "Cachete";
    }
}
