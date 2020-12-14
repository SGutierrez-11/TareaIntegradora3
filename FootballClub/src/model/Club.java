package model;

import java.util.ArrayList;

import model.CoachAssistant;
import model.MainCoach;

public class Club {
    
    private String name; 
    private String nit; 
    private String creationDate; 

    private ArrayList<Employee> employees;
    private Team teamA;
    private Team teamB;

    public Club(String name, String nit, String creationDate){
        this.name = name;
        this.nit = nit;
        this.creationDate = creationDate;
        employees = new ArrayList<Employee>();
        teamA= new Team("A");
        teamB= new Team("B");

    }

    public String addPlayer(int team, String name, String identificator, int salary, String numberShirt, int numberGoals, String position){
        String text = "";
        boolean opt = false;
        Player aPlayer = new Player(name, identificator, salary, numberShirt, numberGoals, position);
        switch(team){
            case 1:
                opt = teamA.addPlayer(aPlayer);
                if(opt){
                    text = "Jugador añadido exitosamente";
                    employees.add(aPlayer);
                } else{
                    text = "No se pudo añadir";
                }
                break;
            case 2:
                opt = teamB.addPlayer(aPlayer);
                if(opt){
                    text = "Jugador añadido con exito";
                    employees.add(aPlayer);
                } else{
                    text = "No se pudo añadir";
                }
                break;
        }
        return text;
    }
    //Main coach
    public String addMainCoach(int team, String name, String identificator, int salary, int experienceYears, int teamsThatEncharger, int wonChampionships){
        MainCoach aMainCoach = new MainCoach(name, identificator, salary, experienceYears, teamsThatEncharger, wonChampionships);
        String msg = "";
        boolean opt = false;
        switch (team) {
            case 1:
                opt = teamA.addMainCoach(aMainCoach);    
                if(opt){
                    employees.add(aMainCoach);
                    msg = "Entrenador añadido con exito";
                }else{msg = "No se pudo añadir el entrenador";}
                break;
        
            case 2:
                opt = teamB.addMainCoach(aMainCoach);
                if(opt){
                    employees.add(aMainCoach);
                    msg = "Entrenador añadido con éxito";
                }else{msg = "No se pudo añadir el entrenador";}
                break;
        }
        return msg;    }
    //Assistarn coach
    public String addCoach(int team, String name, String identificator, int salary, int experienceYears, boolean wasPlayer){
        CoachAssistant aCoachAssistant = new CoachAssistant(name, identificator, salary, experienceYears, wasPlayer);
        String msg = "";
        boolean opt = false;
        switch (team) {
            case 1:
                opt = teamA.addAssistantCoach(aCoachAssistant);
                if(opt){
                    employees.add(aCoachAssistant);
                    msg = "Entrenador añadido con éxito";
                }else{
                    msg = "No se ha podido añadir el entrenador";
                }
                break;
        
            case 2:
                opt = teamB.addAssistantCoach(aCoachAssistant);
                    if(opt){
                        employees.add(aCoachAssistant);
                        msg = "Entrenador añadido con éxito";
                    }else{
                        msg = "No se ha podido añadir el entrenador";
                    }
                break;
        }
        return msg;
    }

    public String showInfo(int opt){
        
        String msg = "";

        switch(opt){
            
            case 1:
                msg = teamA.showTeamInfo();
                break;
            case 2:
                msg = teamB.showTeamInfo();
                break;
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
     * @return String return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return String return the creationDate
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return ArrayList<Employee> return the employees
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    /**
     * @return Team return the teamA
     */
    public Team getTeamA() {
        return teamA;
    }

    /**
     * @param teamA the teamA to set
     */
    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    /**
     * @return Team return the teamB
     */
    public Team getTeamB() {
        return teamB;
    }

    /**
     * @param teamB the teamB to set
     */
    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }

}