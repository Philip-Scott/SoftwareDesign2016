package wingpanel.indicator.bluetooth.controller;

import wingpanel.indicator.bluetooth.backend.BluetoothHardware;

import java.util.ArrayList;

/**
 * Created by felipe on 11/26/16.
 */
public class BluetoothControler {
    private String device_name;
    private Boolean enabled;

    private ArrayList<String> paird_devices;

    public BluetoothControler () {
        updateControler();
    }

    public String getDevice_name () {
        return device_name;
    }

    public boolean getEnabled () {
        return enabled;
    }

    public void setEnabled (boolean state) {
        if (state != this.enabled) {
            this.enabled = state;
            updateHardware();
        }
    }

    public void setDevice_name (String device_name) {
        if (!this.device_name.equals(device_name)) {
            this.device_name = device_name;
            updateHardware();
        }
    }

    public void pairDevice (String device_name) {
        boolean found = false;

        for (int i = 0; i < paird_devices.size(); i++) {
            if (paird_devices.get(i).equals(device_name)) {
                found = true;
            }
        }

        if (!found) {
            paird_devices.add(device_name);
            updateHardware ();
        }
    }

    public void unpairDevice (String device_name) {
        int id = -1;

        for (int i = 0; i < paird_devices.size(); i++) {
            if (paird_devices.get(i).equals(device_name)) {
                id = i;
            }
        }

        if (id != -1) {
            paird_devices.remove(id);
            updateHardware ();
        }
    }

    public String toString () {
        String out = String.format("Bluetooth device: %s\nEnabled: %s\nPaird:", device_name, enabled.toString ());

        for (int i = 0; i < paird_devices.size(); i++) {
            out += String.format(" %s", paird_devices.get(i));
        }

        return out;
    }

    private void updateHardware () {
        String state = String.format("%s %s", device_name, enabled.toString ());

        for (int i = 0; i < paird_devices.size(); i++) {
            state += String.format(" %s", paird_devices.get(i));
        }

        BluetoothHardware.state = state;
    }

    private void updateControler () {
        String raw_data = BluetoothHardware.state;
        String[] split_data = raw_data.split(" ");

        device_name = split_data[0];
        enabled = Boolean.parseBoolean(split_data[1]);

        paird_devices = new ArrayList<String>();

        if (split_data.length > 2) {
            for (int i = 2; i < split_data.length; i++) {
                paird_devices.add(split_data[i]);
            }
        }
    }
}
