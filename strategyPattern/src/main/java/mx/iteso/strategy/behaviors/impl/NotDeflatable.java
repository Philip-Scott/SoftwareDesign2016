package mx.iteso.strategy.behaviors.impl;
import mx.iteso.strategy.behaviors.*;

public class NotDeflatable  implements DeflateBehavior{
    public String deflate() {
        return "I can't deflate!";
    }

    public String inflate() {
        return "I can't inflate!";
    }
}
