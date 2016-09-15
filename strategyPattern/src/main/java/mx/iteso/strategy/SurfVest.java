package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.*;

public abstract class SurfVest {

    public DeflateBehavior deflateBehavior;
    public FloatBehavior floatBehavior;
    public String type;

    public SurfVest(){
    }

    public String Saving() {
        return type + " is Saving you!";
    }

    public String capacityHigh(){ return floatBehavior.FloatCapacity();}

    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() { return deflateBehavior.inflate();}


}
