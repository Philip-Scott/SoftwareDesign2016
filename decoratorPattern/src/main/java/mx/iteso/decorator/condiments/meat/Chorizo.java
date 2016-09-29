package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Chorizo extends CondimentsDecorator {

    public Chorizo(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de chorizo";
    }

    @Override
    public double cost() {
        return 1 * taco.getSize() + taco.cost();
    }

}
