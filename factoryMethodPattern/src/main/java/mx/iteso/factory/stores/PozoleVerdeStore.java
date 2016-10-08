package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

public class PozoleVerdeStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String meat) {
        Pozole pozole = new PozoleVerde();

        pozole = addIngredient(pozole, meat);

        pozole = addIngredient(pozole, "cebolla");
        pozole = addIngredient(pozole, "lechuga");
        pozole = addIngredient(pozole, "rabanos");

        return pozole;

    }
}
