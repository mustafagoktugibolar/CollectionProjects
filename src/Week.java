
public class Week {
    
    private int weekNumber;
    private Match matches;

  
    public Week(Match matches) {
        this.matches = matches;
        
    }

    public Match getMatches() {
        return matches;
    }
    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }
    
}
