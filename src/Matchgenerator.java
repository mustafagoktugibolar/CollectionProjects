import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class Matchgenerator {
    private ArrayList<Team> teams;
    private Match matchList[];
    private ArrayList<Integer> selected;
    private Random random = new Random();
    
    public Matchgenerator(ArrayList<Team> teams) {
        this.teams = teams;
        checkTeamCount();
        
    }
    public void printTeams(){
        for (Team team : teams) {
            System.out.println(team.getName());
        }
    }
    public void printMatches(){
        System.out.println(matchList.length);
    }

    public void generator(){
        matchList = new Match[teams.size() / 2];
       
        int counter = 0;
       
        while(counter < matchList.length){
            int num1 = random.nextInt(teams.size());
            int num2 = random.nextInt(teams.size());    
        }

    }
    

    public ArrayList<Team> getTeams() {
        return teams;
    }


    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    } 


    private void checkTeamCount(){
        if(this.getTeams().size() % 2 != 0){
            this.getTeams().add(new Team(getTeams().size() + 1, "Bay"));
        }
    }
}
