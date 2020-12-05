package model;

public abstract class Coach extends Employee {
	
    private int experienceYears; 

    public Coach(String name){
        super(name);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}