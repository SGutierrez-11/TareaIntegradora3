package model;

import java.util.ArrayList;

public class Club {
    
    private String name; 
    private String nit; 
    private String creationDate; 

    private ArrayList<Employee> employees;
    private Team team1;
    private Team team2;

    public Club(String name){
        this.name = name;
        this.nit = nit;
        this.creationDate = creationDate;
        employees = new ArrayList<Employee>();
        team1 = new Team("A");
        team2 = new Team("B");
    }
		
		public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
		
    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

}