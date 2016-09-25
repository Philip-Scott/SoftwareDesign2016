package mx.iteso.observer.impl;

import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.Subject;

public class StoreMonitorDisplay implements Displayable{
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private Subject scoresData;

    public StoreMonitorDisplay(Subject scoresData){
        this.scoresData = scoresData;
    }

    public String display() {
        String out = "Latest score is:" +
                homeTeam + " (HOME) " + homeGoals + " - " + awayTeam + " (AWAY) " + awayGoals;

        System.out.println(out);
        return out;
    }

    public void update(String home, String away, int homeGoals, int awayGoals, String gamedata) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        display();
    }
}
