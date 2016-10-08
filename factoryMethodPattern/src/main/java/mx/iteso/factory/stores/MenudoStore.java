package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.Menudo;

public class MenudoStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String meat) {
        Pozole pozole = new Menudo();

        pozole = addIngredient(pozole, meat);

        pozole = addIngredient(pozole, "cebolla");
        pozole = addIngredient(pozole, "col");

        return pozole;
    }
}
