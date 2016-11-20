package iteso.mx;

import iteso.mx.Forms.Aggressive;

/**
 * Created by Diego on 11/17/16.
 */
public class States {
    public static void main(String[] args) {
        Animal squirrel = new Squirrel();
        System.out.println (squirrel);

        // Begin aggressiveness!
        squirrel.next_state();
        System.out.println (squirrel);

        // Start world domination!
        squirrel.next_state();
        System.out.println (squirrel);

        // ok... RUN!
        squirrel.next_state();
        System.out.println (squirrel);

        // It was worth a try!
        squirrel.next_state();
        System.out.println (squirrel);
    }
}
