package mx.iteso.observer.impl;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class JamaicanMobileAppTest {
    private JamaicanMobileApp jamaicanMobileApp;

    @Before
    public void setUp() {
        jamaicanMobileApp = mock(JamaicanMobileApp.class);;
    }

    @Test
    public void updateTest(){
        String Chelsea = "Chelsea";
        String RealMadrid = "Real Madrid";
       jamaicanMobileApp.update(Chelsea,RealMadrid,2,0,"New Goal");

        verify(jamaicanMobileApp).update(Chelsea,RealMadrid,2,0,"New Goal");
    }

    @Test
    public void NotifyTest(){
        jamaicanMobileApp.Notifications(true);
        verify(jamaicanMobileApp).Notifications(true);
        jamaicanMobileApp.Notifications(false);
        verify(jamaicanMobileApp).Notifications(false);
    }
}
