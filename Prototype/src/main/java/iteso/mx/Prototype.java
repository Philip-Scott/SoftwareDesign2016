package iteso.mx;

import iteso.mx.Forms.Squirrel;

/**
 * Created by Diego on 07/11/2016.
 */
public class Prototype {
    public static void main(String[] args) {
        Animal original = new Squirrel();
        Animal new_squirrel = (Animal) original.clone();

        System.out.println (original);
        System.out.println (new_squirrel);

        new_squirrel.form = "Cloned Squirrel";

        System.out.println (original);
        System.out.println (new_squirrel);
    }
}
