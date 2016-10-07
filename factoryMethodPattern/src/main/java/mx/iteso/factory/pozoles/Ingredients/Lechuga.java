package mx.iteso.factory.pozoles.Ingredients;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleIngedient;

/**
 * Created by felipe on 10/6/16.
 */
public class Lechuga  extends PozoleIngedient {

    public Lechuga (Pozole posoze) {
        this.pozole = posoze;
        name = "Lechuga";
    }
}
