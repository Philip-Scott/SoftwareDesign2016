package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

/**
 * Created by felipe on 9/26/16.
 */
public class Volcan extends Taco {
    public Volcan(){
        description = "Volcan";
    }

    @Override
    public double cost() {
        return 12.00;
    }

    @Override
    public void setSize (double size_) {
        if (size_ == REGULAR) {
            this.size = size_;
        }
    }
}

