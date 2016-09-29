package mx.iteso.decorator;

public abstract class Taco {
    public static final String MEGA = "MEGA";
    public static final String REGULAR = "REGULAR";
    public static final String MINI = "MINI";


    public String size = REGULAR;
    public String description = "Any Taco";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
