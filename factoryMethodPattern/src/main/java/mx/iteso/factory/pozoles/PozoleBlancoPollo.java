package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

public class PozoleBlancoPollo extends Pozole {
    public PozoleBlancoPollo() {
        name = "Pozole Blanco con Pollo";
        broth = "Caldo Blanco";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}