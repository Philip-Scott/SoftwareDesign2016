package mx.iteso.factory;

import java.util.ArrayList;

public abstract class Pozole {
    public String name;
    public String broth;

    public void serve() {
        System.out.println("Serving in regular pozole plate..." );
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Adding corn kernels..." );
        System.out.println("Adding broth..." );
        System.out.println("Adding toppings:" );
        System.out.println (get_topings());
    }

    public String get_topings () {
        return name + " de " + broth;
    }

    public String getName(){
        return name;
    }
}