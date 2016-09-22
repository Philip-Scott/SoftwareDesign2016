package mx.iteso.observer;

public interface Observer {
    public void update(String home, String away, int homeGoals, int awayGoals, String gamedata);
    public void Notifications(boolean State);
}
