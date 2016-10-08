package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.Pozolillo;

public class PozolilloStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String meat) {
        Pozole pozole = new Pozolillo();

        pozole = addIngredient(pozole, meat);

        pozole = addIngredient(pozole, "elote");
        pozole = addIngredient(pozole, "aguacate");
        pozole = addIngredient(pozole, "rabanos");

        return pozole;
    }
}
