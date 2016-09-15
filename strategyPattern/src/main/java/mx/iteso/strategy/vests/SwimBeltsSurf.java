package mx.iteso.strategy.vests;

import mx.iteso.strategy.*;
import mx.iteso.strategy.behaviors.impl.*;

public class SwimBeltsSurf extends SurfVest {
    public SwimBeltsSurf() {
        deflateBehavior = new Deflatable();
        floatBehavior = new MediumFloat();
        type = "Swim Belts";
    }
}
