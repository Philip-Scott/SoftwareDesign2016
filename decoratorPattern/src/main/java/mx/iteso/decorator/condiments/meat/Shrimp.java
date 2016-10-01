package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.CondimentsDecorator;

public class Shrimp extends CondimentsDecorator {

    public Shrimp (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de camaron";
    }

    @Override
    public double cost() {
        double tacoS = getSize();
            if(!(tacoS == MEGA || tacoS == REGULAR)){
                throw new NullPointerException( "No hay de ese tamaño" );
            }
        return 8 * tacoS + taco.cost();
    }
}