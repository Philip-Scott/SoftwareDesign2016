package mx.iteso.observer.impl;

import com.sun.org.apache.regexp.internal.RE;
import mx.iteso.observer.Observer;
import org.junit.Before;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class StoreMonitorDisplayTest {
    private StoreMonitorDisplay storeMonitorDisplay;
    private ScoresData scoresData;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
    }

    @Test
    public void testUpdate(){
        String Chelsea = "Chelsea";
        String RealMadrid = "Real Madrid";
        storeMonitorDisplay.update(Chelsea,RealMadrid,2,0,"New Goal");
        assertEquals("Latest score is:Chelsea (HOME) 2 - Real Madrid (AWAY) 0",storeMonitorDisplay.display());

        storeMonitorDisplay.update(RealMadrid, Chelsea, 5,1,"New Goal");
        assertEquals("Latest score is:Real Madrid (HOME) 5 - Chelsea (AWAY) 1",storeMonitorDisplay.display());
    }
}
