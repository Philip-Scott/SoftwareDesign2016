package mx.iteso.observer.impl;

import org.junit.Before;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import static org.mockito.Mockito.mock;

public class StoreMonitorDisplayTest {
    private StoreMonitorDisplay storeMonitorDisplay;
    private ScoresData scoresData;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
    }

    @Test
    public void testUpdate() {
        storeMonitorDisplay.update("homeTeam", "awayTeam", 1, 0, "");

    }
}
