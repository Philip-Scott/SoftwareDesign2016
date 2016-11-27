package wingpanel.indicator.bluetooth;

import org.junit.Before;
import org.junit.Test;
import wingpanel.indicator.bluetooth.backend.BluetoothHardware;
import wingpanel.indicator.bluetooth.controller.BluetoothControler;

import static org.junit.Assert.assertEquals;

/**
 * Created by diego on 11/26/16.
 */
public class BluetoothControlerTest {

    BluetoothControler controler;

    @Before
    public void setup () {
        BluetoothHardware.reset();
        controler = new BluetoothControler();
    }

    @Test
    public void defaultTest () {
        assertEquals("Bluetooth device: Userslaptop\nEnabled: false\nPaird: speakers", controler.toString());
        assertEquals("Userslaptop false speakers", BluetoothHardware.state);
    }

    @Test
    public void changeName () {
        controler.setDevice_name("magali");
        assertEquals("magali false speakers", BluetoothHardware.state);
        assertEquals("magali", controler.getDevice_name());
    }

    @Test
    public void pairing () {
        controler.pairDevice("iPhone");
        assertEquals("Userslaptop false speakers iPhone", BluetoothHardware.state);

        controler.unpairDevice("iPhone");
        assertEquals("Userslaptop false speakers", BluetoothHardware.state);

        controler.unpairDevice("speakers");
        assertEquals("Userslaptop false", BluetoothHardware.state);
    }

    @Test
    public void invalidPairing () {
        controler.unpairDevice("iPhone");
        assertEquals("Userslaptop false speakers", BluetoothHardware.state);

        controler.pairDevice("iPhone");
        controler.pairDevice("iPhone");
        assertEquals("Userslaptop false speakers iPhone", BluetoothHardware.state);
    }

    @Test
    public void enable () {
        controler.setEnabled(true);
        assertEquals("Userslaptop true speakers", BluetoothHardware.state);
        assertEquals(true, controler.getEnabled());

        controler.setEnabled(false);
        assertEquals("Userslaptop false speakers", BluetoothHardware.state);
        assertEquals(false, controler.getEnabled());
    }
}
