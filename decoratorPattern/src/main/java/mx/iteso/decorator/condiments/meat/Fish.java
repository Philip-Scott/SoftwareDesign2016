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
        double tacoS = getSize();
        if(tacoS == MEGA || tacoS == REGULAR){

        }
        else{
            throw new NullPointerException( "No hay de ese tamaño" );
        }
        return 3 * taco.getSize()  + taco.cost();
    }
}