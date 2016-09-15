package mx.iteso.strategy.balls;
import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.RollBehavior;
import mx.iteso.strategy.behaviors.impl.*;

public class AmericanFootballBall extends Ball {

    public AmericanFootballBall() {
        bounceBehavior =  new IrregularBounce();
        deflateBehavior = new Deflatable();
        rollBehavior = new IrregularRoll();
        type = "American Football ball";
    }

    public AmericanFootballBall (BounceBehavior bounce, DeflateBehavior deflate, RollBehavior roll) {
        type = "American Football ball";
        bounceBehavior = bounce;
        deflateBehavior = deflate;
        rollBehavior = roll;
    }
}