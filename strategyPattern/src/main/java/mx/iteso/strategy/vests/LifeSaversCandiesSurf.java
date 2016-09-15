package mx.iteso.strategy.vests;

import mx.iteso.strategy.*;
import mx.iteso.strategy.behaviors.impl.*;

public class LifeSaversCandiesSurf extends SurfVest {
    public LifeSaversCandiesSurf() {
        deflateBehavior = new NotDeflatable();
        floatBehavior = new LowFloat();
        type = "Life Savers Candies?";
    }
}
