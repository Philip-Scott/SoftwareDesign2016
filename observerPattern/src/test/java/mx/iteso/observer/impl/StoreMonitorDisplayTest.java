package mx.iteso.observer.impl;

import com.sun.org.apache.regexp.internal.RE;
import mx.iteso.observer.Observer;
import org.junit.Before;
import org.junit.Test;
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
        storeMonitorDisplay = mock(StoreMonitorDisplay.class);
        String Chelsea = "Chelsea";
        String RealMadrid = "Real Madrid";
        storeMonitorDisplay.update(Chelsea,RealMadrid,2,0,"New Goal");
        storeMonitorDisplay.display();

        verify(storeMonitorDisplay).update(Chelsea,RealMadrid,2,0,"New Goal");
        verify(storeMonitorDisplay).display();

    }
}
