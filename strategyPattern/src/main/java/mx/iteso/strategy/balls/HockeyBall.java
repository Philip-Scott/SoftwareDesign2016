package mx.iteso.strategy.balls;
import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.RollBehavior;
import mx.iteso.strategy.behaviors.impl.*;

public class HockeyBall extends Ball{
    public HockeyBall() {
        bounceBehavior =  new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        rollBehavior = new IrregularRoll();
        type = "Hockey ball";
    }

    public HockeyBall (BounceBehavior bounce, DeflateBehavior deflate, RollBehavior roll) {
        type = "Hockey ball";
        bounceBehavior = bounce;
        deflateBehavior = deflate;
        rollBehavior = roll;
    }
}
