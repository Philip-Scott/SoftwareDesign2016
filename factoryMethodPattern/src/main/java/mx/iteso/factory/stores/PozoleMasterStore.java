package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

/**
 * Created by felipe on 10/6/16.
 */
public class PozoleMasterStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String meat) {
        Pozole pozole = null;
        if (meat.equals("pollo rojo"))
            pozole = new PozoleRojoPollo();
        else if (meat.equals("cachete rojo") )
            pozole = new PozoleRojoCachete();
        else if (meat.equals("oreja rojo"))
            pozole = new PozoleRojoOreja();
        else if (meat.equals("pierna rojo") )
            pozole = new PozoleRojoPierna();
        else if (meat.equals("trompa rojo"))
            pozole = new PozoleRojoTrompa();
        else if (meat.equals("pollo rojo"))
            pozole = new PozoleVerdePollo();
        else if (meat.equals("cachete verde") )
            pozole = new PozoleVerdeCachete();
        else if (meat.equals("oreja verde"))
            pozole = new PozoleVerdeOreja();
        else if (meat.equals("pierna verde") )
            pozole = new PozoleVerdePierna();
        else if (meat.equals("trompa verde"))
            pozole = new PozoleVerdeTrompa();
        else if (meat.equals("menudo")) {
            pozole = new Menudo();
        }

        return pozole;
    }
}
