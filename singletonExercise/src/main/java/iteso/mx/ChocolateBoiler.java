package iteso.mx;

/**
 * Created by felipe on 10/20/16.
 */
/*
private final ThreadLocal perThreadInstance = new ThreadLocal();
private Helper helper = null;
public Helper getHelper() {
        if (perThreadInstance.get() == null) createHelper();
        return helper;
        }
private final void createHelper() {
synchronized(this) {
        if (helper == null)
        helper = new Helper();
        }
        // Any non-null value would do as the argument here
        perThreadInstance.set(perThreadInstance);
        }
        }*/

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler instance = null;

    private ChocolateBoiler () {
        empty = true;
        boiled = false;
    }

    public synchronized static ChocolateBoiler getInstance () {
        if (instance == null) {
            synchronized (ChocolateBoiler.class) {
                instance = new ChocolateBoiler();
            }
        }

        return instance;
    }

    public synchronized boolean fill () {
        synchronized (ChocolateBoiler.class) {
            Time();
            if (isEmpty()) {
                empty = false;
                boiled = false;
                return true;
            }
        }
        return false;
    }

    public synchronized boolean drain () {
        synchronized (ChocolateBoiler.class) {
            Time();
            if (!isEmpty() && isBoiled()) {
                // drain the boiled milk and chocolate
                empty = true;
                return true;
            }
        }

        return false;
    }

    public synchronized boolean boil () {
        synchronized (ChocolateBoiler.class) {
            Time();
            if (!isEmpty () && !isBoiled ()) {
                // bring the contents to a boil
                boiled = true;
                return true;
            }
        }

        return false;
    }

    public void Time(){
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){

        }
    }

    public synchronized boolean isEmpty () {
        return empty;
    }

    public synchronized boolean isBoiled () {
        return boiled;
    }
}
