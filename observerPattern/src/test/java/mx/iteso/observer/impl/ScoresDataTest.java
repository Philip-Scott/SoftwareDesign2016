package mx.iteso.observer.impl;

import mx.iteso.observer.Observer;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class ScoresDataTest {
    private final String TEAM1 = "TestTeam1";
    private final String TEAM2 = "TestTeam2";

    ScoresData scoresData;
    Observer observer;

    @Before
    public void setUp() {
        scoresData = new ScoresData();
        observer = mock(Observer.class);
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testRegisterAndRemoveObserver() {
        scoresData.registerObserver(observer);
        scoresData.removeObserver(observer);
        scoresData.removeObserver(observer);
    }

    @Test
    public void test_player_scores () {
        scoresData.registerObserver(observer);
        scoresData.playerScored("Diego", 42, "Delantero", TEAM1);
        scoresData.playerScored("Felipe", 31, "Portero", TEAM1);
        scoresData.setScore(TEAM1, TEAM2, 2, 0);

        verify(observer, times(1)).update(TEAM1, TEAM2, 2, 0, "Diego: 42: Delantero: TestTeam1\n" + "Felipe: 31: Portero: TestTeam1");
    }

    @Test
    public void testSetScore() {
        scoresData.registerObserver(observer);
        scoresData.registerObserver(observer);
        scoresData.setScore(TEAM1, TEAM2, 1, 0);
        verify(observer, times(2)).update(TEAM1, TEAM2, 1, 0, "");
    }
}
