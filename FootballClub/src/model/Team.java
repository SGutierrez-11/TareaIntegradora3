package model;

import java.util.ArrayList;

public class Team {
    
    private String name; 
    private MainCoach mainCoach;
    private CoachAssistant[] assistantsCoach; 
    private ArrayList<LineUp> lineUp;
    private Player[] players; 


    public Team(){
        this.name = name;
        assistantsCoach = new CoachAssistant[3];
        lineUp = new ArrayList<LineUp>();
        players = new Player[25];
    }
		
		public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MainCoach getMainCoach() {
        return mainCoach;
    }

    public void setMainCoach(MainCoach mainCoach) {
        this.mainCoach = mainCoach;
    }

    public CoachAssistant[] getAssistantsCoach() {
        return assistantsCoach;
    }

    public void setAssistantsCoach(CoachAssistant[] assistantsCoach) {
        this.assistantsCoach = assistantsCoach;
    }

    public ArrayList<LineUp> getLineUp() {
        return lineUp;
    }

    public void setLineUp(ArrayList<LineUp> lineUp) {
        this.lineUp = lineUp;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
    
}