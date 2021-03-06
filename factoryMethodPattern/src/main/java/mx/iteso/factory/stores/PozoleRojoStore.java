package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;
import mx.iteso.factory.pozoles.Ingredients.*;

public class PozoleRojoStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String meat) {
        Pozole pozole = new PozoleRojo();

        pozole = addIngredient(pozole, meat);

        pozole = addIngredient(pozole, "oregano");
        pozole = addIngredient(pozole, "rabanos");
        pozole = addIngredient(pozole, "col");

        return pozole;
    }
}
