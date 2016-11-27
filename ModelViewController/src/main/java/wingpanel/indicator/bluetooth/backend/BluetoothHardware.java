package wingpanel.indicator.bluetooth.backend;

/**
 * Created by felipe on 11/26/16.
 */
public class BluetoothHardware {
    private static final String defaultState = "Userslaptop false speakers";

    // Mocks a bluetooth interface
    // <display name> <State> <paired device 1> <paired device 2> ...
    public static String state = defaultState;

    public static void reset () {
        state = defaultState;
    }
}
