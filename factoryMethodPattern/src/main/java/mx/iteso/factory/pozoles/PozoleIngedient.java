package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

import java.util.ArrayList;

/**
 * Created by felipe on 10/6/16.
 */
public abstract class PozoleIngedient extends Pozole {
    protected Pozole pozole;
    protected String name;

    public String getName () {return pozole.getName() + " con " + name;}

    public String prepare () {
        return pozole.prepare() + ", " + name;
    }
}
