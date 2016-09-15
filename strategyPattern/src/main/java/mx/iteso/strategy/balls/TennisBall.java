package mx.iteso.strategy.balls;
import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.RollBehavior;
import mx.iteso.strategy.behaviors.impl.*;

public class TennisBall extends Ball{
    public TennisBall() {
        bounceBehavior =  new NormalBounce();
        deflateBehavior = new NotDeflatable();
        rollBehavior = new NormalRoll();
        type = "Tennis ball";
    }

    public TennisBall (BounceBehavior bounce, DeflateBehavior deflate, RollBehavior roll) {
        type = "Tennis ball";

        bounceBehavior = bounce;
        deflateBehavior = deflate;
        rollBehavior = roll;
    }
}
