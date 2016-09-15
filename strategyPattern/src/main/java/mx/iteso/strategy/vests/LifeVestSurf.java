package mx.iteso.strategy.vests;

import mx.iteso.strategy.*;
import mx.iteso.strategy.behaviors.impl.*;

public class LifeVestSurf extends SurfVest {
    public LifeVestSurf() {
        deflateBehavior = new Deflatable();
        floatBehavior = new FullFloat();
        type = "Life Vest";
    }
}
