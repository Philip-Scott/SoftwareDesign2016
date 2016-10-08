package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

/**
 * Created by felipe on 10/6/16.
 */
public class PozoleMasterStore {

    MenudoStore menudo;
    PozoleBlancoStore blanco;
    PozoleRojoStore rojo;
    PozoleVerdeStore verde;
    PozolilloStore pozolillo;

    protected Pozole createPozole(String type, String meat) throws IllegalArgumentException {
        if (type.equals("menudo")) {
            return menudo.createPozole (meat);
        } else if (type.equals("blanco")) {
            return blanco.createPozole(meat);
        } else if (type.equals("verde")) {
            return verde.createPozole(meat);
        } else if (type.equals(rojo)) {
            return rojo.createPozole(meat);
        } else if (type.equals(pozolillo)) {
            return pozolillo.createPozole(meat);
        } else throw new IllegalArgumentException("Invalid Type: " + type);
    }
}
