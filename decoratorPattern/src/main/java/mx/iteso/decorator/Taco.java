package mx.iteso.decorator;

public abstract class Taco {
    public static final double MEGA = 2.1;
    public static final double REGULAR = 1;
    public static final double MINI = 0.8;

    public double size = REGULAR;
    public String description = "Any Taco";
    public String getDescription(){
        return description;
    }
    public void setSize (double size_) {
        if (size_ == MEGA || size_ == REGULAR || size_ == MINI) {
            this.size = size_;
        }
    }

    public double getSize () {
        return size;
    }
    public abstract double cost();
}
