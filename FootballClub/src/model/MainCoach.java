package model;

public class MainCoach extends Coach implements Profitable {
    private int teamsThatEncharger; 
    private int wonChampionships; 
    private Skill coachSkills; 

    public MainCoach(String name) {
        super(name);
        this.teamsThatEncharger = teamsThatEncharger;
        this.wonChampionships = wonChampionships;
        this.coachSkills = coachSkills;
    }
		
		  public int getTeamsThatEncharger() {
        return teamsThatEncharger;
    }

    public void setTeamsThatEncharger(int teamsThatEncharger) {
        this.teamsThatEncharger = teamsThatEncharger;
    }

    public int getWonChampionships() {
        return wonChampionships;
    }

    public void setWonChampionships(int wonChampionships) {
        this.wonChampionships = wonChampionships;
    }

    public Skill getCoachSkills() {
        return coachSkills;
    }

    public void setCoachSkills(Skill coachSkills) {
        this.coachSkills = coachSkills;
    }
  

    
}