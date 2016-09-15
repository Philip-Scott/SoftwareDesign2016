package mx.iteso.strategy.balls;
import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.RollBehavior;
import mx.iteso.strategy.behaviors.impl.*;

public class BaseballBall extends Ball {
    public BaseballBall() {
        bounceBehavior = new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        rollBehavior = new NormalRoll();
        type = "Baseball ball";
    }

    public BaseballBall (BounceBehavior bounce, DeflateBehavior deflate, RollBehavior roll) {
        type = "Baseball ball";
        bounceBehavior = bounce;
        deflateBehavior = deflate;
        rollBehavior = roll;
    }
}
