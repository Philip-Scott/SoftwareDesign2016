package mx.iteso.factory;

import mx.iteso.factory.pozoles.Ingredients.*;

public abstract class PozoleStore {

    public Pozole orderPozole(String meat){
        Pozole pozole;

        pozole = createPozole(meat);

        System.out.println (pozole.prepare());
        pozole.serve();

        return pozole;
    }

    public Pozole addIngredient (Pozole pozole, String ingredient) throws IllegalArgumentException{
        Pozole out;
        if (ingredient.equals("pollo"))
            out = new Pollo (pozole);
        else if (ingredient.equals("cachete") )
            out = new Cachete(pozole);
        else if (ingredient.equals("oreja"))
            out = new Oreja(pozole);
        else if (ingredient.equals("pierna") )
            out = new Pierna(pozole);
        else if (ingredient.equals("trompa"))
            out = new Trompa(pozole);
        else if (ingredient.equals("cebolla"))
            out = new Cebolla (pozole);
        else if (ingredient.equals("col") )
            out = new Col(pozole);
        else if (ingredient.equals("lechuga"))
            out = new Lechuga(pozole);
        else if (ingredient.equals("oregano") )
            out = new Oregano(pozole);
        else if (ingredient.equals("rabanos"))
            out = new Rabanos(pozole);
        else if (ingredient.equals("elotes"))
            out = new Rabanos(pozole);
        else if (ingredient.equals("aguacate"))
            out = new Rabanos(pozole);
        else throw new IllegalArgumentException ("Ingredient does not exist: " + ingredient);

        return out;
    }

    protected abstract Pozole createPozole(String meat);
}