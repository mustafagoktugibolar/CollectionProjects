package FixtureGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Fixture {
    List<Team> teams;
    List<String> firstRounds, secondRounds;

    private int sc = 1;


    public Fixture(List<Team> teams) {
        this.teams = teams;
        firstRounds = new ArrayList<>();
        secondRounds = new ArrayList<>();

        if(teams.size() % 2 != 0){
            teams.add(new Team(0, "BAY!"));
        }

        generate();
    }

    public void generate() {
        int totalRounds = teams.size() - 1;

        // Create a copy of teams and shuffle it to randomize the order
        List<Team> shuffledTeams = new ArrayList<>(teams);
        Collections.shuffle(shuffledTeams);

        for (int round = 0; round < totalRounds; round++) {
            for (int i = 0; i < teams.size() / 2; i++) {
                Team home = shuffledTeams.get(i);
                Team away = shuffledTeams.get(teams.size() - 1 - i);

                if (!firstRounds.contains(home.getName() + " - " + away.getName())
                        && !secondRounds.contains(away.getName() + " - " + home.getName())) {
                    firstRounds.add(home.getName() + " - " + away.getName());
                    secondRounds.add(away.getName() + " - " + home.getName());
                }
            }

            // Rotate the teams in the shuffled list to create the next round
            Team lastTeam = shuffledTeams.remove(shuffledTeams.size() - 1);
            shuffledTeams.add(1, lastTeam);
        }

        display(firstRounds);
        display(secondRounds);
    }

    private void display(List<String> rounds){
        for (int i = 0; i < rounds.size(); i++) {
            if (i % (teams.size() / 2) == 0) {
                System.out.println("\n " + sc + ". Round: ");
                sc++;
            }

            System.out.println(rounds.get(i));

        }
    }
}