package model;

import java.util.ArrayList;

import model.CoachAssistant;

public class Team {
    
    private String name; 
    private MainCoach mainCoach;
    private CoachAssistant[] assistantsCoach; 
    private ArrayList<LineUp> lineUp;
    private Player[] players; 


    public Team(String name){
        this.name = name;
        assistantsCoach = new CoachAssistant[3];
        lineUp = new ArrayList<LineUp>();
        players = new Player[25];
    }
    public boolean addPlayer(Player aPlayer){
        boolean answ = false;
        for(int i = 0; i < players.length && !answ; i++){
            if(players[i] == null){
                players[i] = aPlayer;
                answ = true;
            }
        }
        
        return answ;
    }
    public boolean addMainCoach(MainCoach aMainCoach){
        boolean answ = false;
        if(mainCoach == null){
            mainCoach = aMainCoach;
            answ = true;
        }
        return answ;
    }
    public boolean addAssistantCoach(CoachAssistant aCoachAssistant){
        boolean answ = false;
        for(int i = 0; i < assistantsCoach.length && !answ; i++){
            if(assistantsCoach[i] == null){
                assistantsCoach[i] = aCoachAssistant;
                answ = true;
            }
        }
        return answ;
    }

    public String showTeamInfo(){

        String msg = "";
        msg += "Entrenador principal:\n";
        if(mainCoach != null){
            msg += mainCoach.employeeToString();
        }
        msg += "Entrenadores asistentes:\n";
        if(assistantsCoach[0] != null){
            for(int i = 0; i < assistantsCoach.length; i++){
                if(assistantsCoach[i] != null){
                    msg += assistantsCoach[i].employeeToString()+"\n";   
                }
            }
        }
        msg += "Jugadores del equipo:\n";
        
            for(int i = 0; i < players.length; i++){
                if(players[i] != null){
                    msg += players[i].employeeToString()+"\n";
                }
            }
        return msg;
    }
		
	
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return MainCoach return the mainCoach
     */
    public MainCoach getMainCoach() {
        return mainCoach;
    }

    /**
     * @param mainCoach the mainCoach to set
     */
    public void setMainCoach(MainCoach mainCoach) {
        this.mainCoach = mainCoach;
    }

    /**
     * @return CoachAssistant[] return the assistantsCoach
     */
    public CoachAssistant[] getAssistantsCoach() {
        return assistantsCoach;
    }

    /**
     * @param assistantsCoach the assistantsCoach to set
     */
    public void setAssistantsCoach(CoachAssistant[] assistantsCoach) {
        this.assistantsCoach = assistantsCoach;
    }

    /**
     * @return ArrayList<LineUp> return the lineUp
     */
    public ArrayList<LineUp> getLineUp() {
        return lineUp;
    }

    /**
     * @param lineUp the lineUp to set
     */
    public void setLineUp(ArrayList<LineUp> lineUp) {
        this.lineUp = lineUp;
    }

    /**
     * @return Player[] return the players
     */
    public Player[] getPlayers() {
        return players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(Player[] players) {
        this.players = players;
    }

}