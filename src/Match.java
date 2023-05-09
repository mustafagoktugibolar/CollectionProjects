
public class Match {
    private Team home;
    private Team away;
    
  
    public Match(Team home, Team away) {
        this.home = home;
        this.away = away;
        
    }

    public Match(){
        
    }
    public Team getHome() {
        return home;
    }
    public void setHome(Team home) {
        this.home = home;
    }
    public Team getAway() {
        return away;
    }
    public void setAway(Team away) {
        this.away = away;
    }
    
}
