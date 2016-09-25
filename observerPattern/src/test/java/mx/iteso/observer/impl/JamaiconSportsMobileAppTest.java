package mx.iteso.observer.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by felipe on 9/22/16.
 */
public class JamaiconSportsMobileAppTest {
        private JamaiconSportsMobileApp app;
        private ScoresData scoresData;

        @Before
        public void setUp() {
            scoresData = new ScoresData ();
            app = new JamaiconSportsMobileApp(scoresData);
        }

        //@Test
        //public void testUpdate() {
          //  app.update("homeTeam", "awayTeam", 1, 0, "");
       // }

        @Test
        public void testNotifications(){
            String Chelsea = "Chelsea";
            String RealMadrid = "Real Madrid";

            app.Notifications (false);
            scoresData.setScore (Chelsea,RealMadrid,5,3);
            assertEquals (app.display(), "Latest score is:\n" +
                                         "null (HOME) 0 - null (AWAY) 0"); //Null because nothing should be there

            app.Notifications (true);
            scoresData.setScore (Chelsea,RealMadrid,2,0);
            assertEquals (app.display(), "Latest score is:\n" +
                    "Chelsea (HOME) 2 - Real Madrid (AWAY) 0"); //Should get something
        }
}
