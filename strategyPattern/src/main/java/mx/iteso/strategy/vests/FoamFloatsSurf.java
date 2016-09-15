package mx.iteso.strategy.vests;

import mx.iteso.strategy.*;
import mx.iteso.strategy.behaviors.impl.*;

public class FoamFloatsSurf extends SurfVest{
    public FoamFloatsSurf() {
        deflateBehavior = new NotDeflatable();
        floatBehavior = new LowFloat();
        type = "Foam Floats";
    }
}
