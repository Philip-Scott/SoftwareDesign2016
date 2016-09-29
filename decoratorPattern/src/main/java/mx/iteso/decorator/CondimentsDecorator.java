package mx.iteso.decorator;

public abstract class CondimentsDecorator extends Taco {
    protected Taco taco;

    public abstract String getDescription();

    @Override
    public double getSize () {
        return taco.getSize();
    }
}
