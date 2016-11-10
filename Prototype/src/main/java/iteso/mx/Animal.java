package iteso.mx;

/**
 * Created by Diego on 08/11/2016.
 */
public abstract class Animal implements Cloneable {
    public String form;

    public String toString () {
        return form;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
