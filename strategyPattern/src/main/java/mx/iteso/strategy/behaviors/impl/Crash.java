package mx.iteso.strategy.behaviors.impl;
import mx.iteso.strategy.behaviors.*;

public class Crash implements BounceBehavior {

    public String bounce() {
        return "I crashed!! I can't bounce";
    }

}