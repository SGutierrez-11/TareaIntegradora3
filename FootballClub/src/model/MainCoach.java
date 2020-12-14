package model;

import model.Skill;

public class MainCoach extends Coach implements Profitable {
    private int teamsThatEncharger; 
    private int wonChampionships; 
    private Skill coachSkills; 

    public MainCoach(String name, String identificator, int salary, int experienceYears, int teamsThatEncharger, int wonChampionships) {
        super(name, identificator, salary, experienceYears);
        this.teamsThatEncharger = teamsThatEncharger;
        this.wonChampionships = wonChampionships;

    }
    @Override
    public String employeeToString() {
        String msg = super.employeeToString();
        msg += "Cantidad de equipos liderados " + teamsThatEncharger + "\n" 
            + "Cantidad de campeonatos ganados: "+ wonChampionships + "\n";
        return msg;
    }
		
	
    /**
     * @return int return the teamsThatEncharger
     */
    public int getTeamsThatEncharger() {
        return teamsThatEncharger;
    }

    /**
     * @param teamsThatEncharger the teamsThatEncharger to set
     */
    public void setTeamsThatEncharger(int teamsThatEncharger) {
        this.teamsThatEncharger = teamsThatEncharger;
    }

    /**
     * @return int return the wonChampionships
     */
    public int getWonChampionships() {
        return wonChampionships;
    }

    /**
     * @param wonChampionships the wonChampionships to set
     */
    public void setWonChampionships(int wonChampionships) {
        this.wonChampionships = wonChampionships;
    }

    /**
     * @return Skill return the coachSkills
     */
    public Skill getCoachSkills() {
        return coachSkills;
    }

    /**
     * @param coachSkills the coachSkills to set
     */
    public void setCoachSkills(Skill coachSkills) {
        this.coachSkills = coachSkills;
    }

}