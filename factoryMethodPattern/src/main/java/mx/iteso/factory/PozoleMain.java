package mx.iteso.factory;

import mx.iteso.factory.pozoles.Ingredients.*;
import mx.iteso.factory.pozoles.Menudo;
import mx.iteso.factory.pozoles.PozoleRojo;
import mx.iteso.factory.pozoles.PozoleVerde;
import mx.iteso.factory.stores.MenudoStore;
import mx.iteso.factory.stores.PozoleRojoStore;
import mx.iteso.factory.stores.PozoleVerdeStore;
import mx.iteso.factory.stores.PozoleBlancoStore;
import sun.util.resources.cldr.gu.LocaleNames_gu;

public class PozoleMain {
    public static void main (String[] args) {
        PozoleStore verdeStore = new PozoleVerdeStore();
        PozoleStore rojoStore = new PozoleRojoStore();
        PozoleStore blancoStore = new PozoleBlancoStore();
        PozoleStore menuderia = new MenudoStore();

        Pozole pozole = blancoStore.orderPozole("pollo");

        System.out.println("First order is: "+ pozole.getName());

        pozole = rojoStore.orderPozole("pollo");
        System.out.println();

        System.out.println("Second order is: "+ pozole.getName());
        System.out.println();

        pozole = menuderia.orderPozole("pollo");

        System.out.println("Third order is: "+ pozole.getName());
    }
}