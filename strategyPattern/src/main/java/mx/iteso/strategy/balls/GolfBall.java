package mx.iteso.strategy.balls;
import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.RollBehavior;
import mx.iteso.strategy.behaviors.impl.*;

public class GolfBall extends Ball{
    public GolfBall() {
        bounceBehavior = new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        rollBehavior = new NormalRoll();
        type = "Golf ball";
    }

    public GolfBall (BounceBehavior bounce, DeflateBehavior deflate, RollBehavior roll) {
        type = "Golf ball";
        bounceBehavior = bounce;
        deflateBehavior = deflate;
        rollBehavior = roll;
    }
}
