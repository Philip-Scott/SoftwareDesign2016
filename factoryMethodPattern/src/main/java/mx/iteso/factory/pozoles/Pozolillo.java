package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by felipe on 10/8/16.
 */
public class Pozolillo extends Pozole {
    public Pozolillo() {
        name = "Menudo";
        broth = "Caldo Verde";
    }

    @Override
    public String serve() {
        String out = "";
        out += "Serving xtra hot in special pozolillo plate...";
        return out;
    }
}
