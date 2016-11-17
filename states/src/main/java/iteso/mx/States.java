package iteso.mx;

import iteso.mx.Forms.Aggressive;

/**
 * Created by Diego on 11/17/16.
 */
public class States {
    public static void main(String[] args) {
        Animal squirrel = new Squirrel();

        System.out.println (squirrel);

        squirrel.set_state(new Aggressive());

        System.out.println (squirrel);
    }
}
