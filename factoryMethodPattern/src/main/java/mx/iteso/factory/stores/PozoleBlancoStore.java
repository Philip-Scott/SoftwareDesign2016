package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;
import mx.iteso.factory.pozoles.Ingredients.*;

/**
 * Created by felipe on 10/6/16.
 */
public class PozoleBlancoStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String meat) {
        Pozole pozole = new PozoleBlanco();

        pozole = addIngredient(pozole, meat);

        pozole = addIngredient(pozole, "cebolla");
        pozole = addIngredient(pozole, "lechuga");
        pozole = addIngredient(pozole, "rabanos");

        return pozole;
    }
}
