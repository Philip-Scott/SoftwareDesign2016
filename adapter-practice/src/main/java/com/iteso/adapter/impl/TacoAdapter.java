package com.iteso.adapter.impl;

import com.iteso.adapter.Taco;
import com.iteso.adapter.Torta;

/**
 * Created by felipe
 */
public class TacoAdapter implements Torta {
    Taco taco;

    public TacoAdapter (Taco taco){
        this.taco = taco;
    }


    public String cutByHalf () {
        return "";
    }

    public String fill () {
        return taco.fill ();

    }

    public String cover () {
        return taco.fold ();
    }

    public String printDescription () {
        return taco.printDescription();
    }
}
