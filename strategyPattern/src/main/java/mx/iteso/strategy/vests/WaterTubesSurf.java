package mx.iteso.strategy.vests;

import mx.iteso.strategy.*;
import mx.iteso.strategy.behaviors.impl.*;

public class WaterTubesSurf extends SurfVest{
    public WaterTubesSurf() {
        deflateBehavior = new Deflatable();
        floatBehavior = new FullFloat();
        type = "Water Tubes";
    }
}
