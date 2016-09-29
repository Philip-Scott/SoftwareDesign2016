package mx.iteso.decorator.condiments.meat;
import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Fish extends CondimentsDecorator {

    public Fish (Taco taco){ this.taco = taco;}

    @Override
    public String getDescription() {
        return taco.getDescription() + " de pescado";
    }

    @Override
    public double cost() {
        return 7  + taco.cost();
    }
}