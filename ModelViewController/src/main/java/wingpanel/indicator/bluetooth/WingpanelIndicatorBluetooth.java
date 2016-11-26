package wingpanel.indicator.bluetooth;

import wingpanel.indicator.bluetooth.controller.BluetoothControler;

/**
 * Created by felipe on 11/26/16.
 */
public class WingpanelIndicatorBluetooth {

    public static void main (String[] args) {
        BluetoothControler controler = new BluetoothControler();

        System.out.println (controler);

        //User flips switch, and pairs their phone
        controler.setEnabled(true);
        controler.pairDevice("iPhone");

        System.out.println (controler);

        // User unpairs speakers, and shuts down bluetooth
        controler.unpairDevice("speakers");
        controler.setEnabled(false);

        System.out.println (controler);
    }
}
