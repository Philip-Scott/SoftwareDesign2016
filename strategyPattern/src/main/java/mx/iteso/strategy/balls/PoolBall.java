package mx.iteso.strategy.balls;
import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.RollBehavior;
import mx.iteso.strategy.behaviors.impl.*;

public class PoolBall extends Ball{
    public PoolBall() {
        bounceBehavior =  new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        rollBehavior = new NormalRoll();
        type = "Pool ball";
    }

    public PoolBall (BounceBehavior bounce, DeflateBehavior deflate, RollBehavior roll) {
        type = "Pool ball";
        bounceBehavior = bounce;
        deflateBehavior = deflate;
        rollBehavior = roll;
    }
}
