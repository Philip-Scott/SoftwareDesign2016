package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.*;

public abstract class Ball {

    protected RollBehavior rollBehavior;
    protected BounceBehavior bounceBehavior;
    protected DeflateBehavior deflateBehavior;

    protected String type;

    public Ball() {
    }

    public void setBounceBehavior (BounceBehavior behavior) {
        this.bounceBehavior = behavior;
    }

    public String roll() {
        return type + ": " + rollBehavior.Roll();
    }

    public String performBounce() {
        return bounceBehavior.bounce();
    }

    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() {
        return deflateBehavior.inflate();
    }

}
