package mx.iteso.observer.impl;

import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.Subject;

/**
 * Created by felipe on 9/22/16.
 */
public class JamaiconSportsMobileApp implements Observer {
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private Subject scoresData;

    public JamaiconSportsMobileApp(Subject scoresData){
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
    }

    public String display() {
        String out = "Latest score is:\n" +
                homeTeam + " (HOME) " + homeGoals + " - " + awayTeam + " (AWAY) " + awayGoals;

        System.out.println(out);
        return out;
    }
    public void Notifications(boolean State){
        if(true == State){
            this.scoresData.registerObserver(this);
        } else {
            this.scoresData.removeObserver(this);
        }
    }

    public void update(String home, String away, int homeGoals, int awayGoals, String gamedata) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        display();
    }
}