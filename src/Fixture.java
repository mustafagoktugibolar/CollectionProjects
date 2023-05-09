import java.util.ArrayList;

public class Fixture{
   
    private ArrayList<Week> weeks;


    public Fixture(ArrayList<Week> weeks) {
        this.weeks = weeks;
    }

    public void display(){
        for (Week string : weeks) {
            System.out.println();
        }
    }
  
}

