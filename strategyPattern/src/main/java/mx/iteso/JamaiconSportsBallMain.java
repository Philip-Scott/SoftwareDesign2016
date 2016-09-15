package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.*;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
        Ball[] balls = new Ball[8];

        balls[0] = (new AmericanFootballBall());
        balls[1] = (new BaseballBall());
        balls[2] = (new GolfBall());
        balls[3] = (new HockeyBall());
        balls[4] = (new PoolBall());
        balls[5] = (new SoccerBall());
        balls[6] = (new TennisBall());
        balls[7] = (new VolleyballBall());

        for (int i = 0; i < balls.length; i++) {
            Ball ball = balls[i];

            System.out.println(ball.roll());
            System.out.println(ball.performBounce());
            System.out.println(ball.performDeflate());
            System.out.println(ball.performInflate());
            System.out.println(ball.performInflate());

            System.out.println();
        }
    }
}
