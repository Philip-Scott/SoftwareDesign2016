package mx.iteso.factory;

import java.util.ArrayList;

public abstract class Pozole {
    public String name;
    public String broth;

    public void serve() {
        System.out.println("Serving in regular pozole plate..." );
    }

    public String prepare() {
        String out = "";
        out += ("Preparing " + name + "\n");
        out += ("Adding corn kernels...\n" );
        out += ("Adding broth & toppings...\n" );
        out += (broth);

        return out;
    }

    public String getTopings () {
        return name + " de " + broth;
    }

    public String getName(){
        return name + " de " + broth;
    }
}