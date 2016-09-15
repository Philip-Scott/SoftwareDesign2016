package mx.iteso.strategy.balls;
import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.RollBehavior;
import mx.iteso.strategy.behaviors.impl.*;

public class VolleyballBall extends Ball {
    public VolleyballBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        rollBehavior = new NormalRoll();
        type = "Voleyball ball";
    }
    public VolleyballBall (BounceBehavior bounce, DeflateBehavior deflate, RollBehavior roll) {
        type = "Voleyball ball";
        bounceBehavior = bounce;
        deflateBehavior = deflate;
        rollBehavior = roll;
    }
}
