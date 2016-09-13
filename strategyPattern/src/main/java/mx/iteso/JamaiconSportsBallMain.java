package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.AmericanFootballBall;
import mx.iteso.strategy.balls.BaseballBall;
import mx.iteso.strategy.balls.SoccerBall;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();

        System.out.println(soccer.roll());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());

        System.out.println();

        System.out.println(american.roll());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());

        System.out.println();

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());

    }
}
