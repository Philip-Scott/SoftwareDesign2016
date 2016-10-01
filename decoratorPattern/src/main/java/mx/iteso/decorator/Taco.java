package mx.iteso.decorator;

public abstract class Taco {
    public static final double MEGA = 2.1;
    public static final double REGULAR = 1;
    public static final double MINI = 0.8;

    public double size = REGULAR;
    public String description = "Any Taco";
    public String getDescription(){
        return sizeToString () + description;
    }
    public void setSize (double size_) {
        if (size_ == MEGA || size_ == REGULAR || size_ == MINI) {
            this.size = size_;
        }
    }

    public String sizeToString () {
        if (size == MEGA) {
            return "MEGA";
        } else if (size == REGULAR) {
            return "";
        } else {
            return "mini ";
        }
    }

    public double getSize () {
        return size;
    }
    public abstract double cost();
}
