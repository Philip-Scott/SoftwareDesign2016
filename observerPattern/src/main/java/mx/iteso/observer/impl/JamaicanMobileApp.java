package mx.iteso.observer.impl;
import mx.iteso.observer.Observer;
import mx.iteso.observer.Subject;

public class JamaicanMobileApp implements Observer{
    private Subject scoresData;
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;

    public void update(String home, String away, int homeGoals, int awayGoals, String gamedata) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
    }

    public void Notifications(boolean State){
        if(true == State){
            this.scoresData.registerObserver(this);
        } else {
            this.scoresData.removeObserver(this);
        }
    }
}
