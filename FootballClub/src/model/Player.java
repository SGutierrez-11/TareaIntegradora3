package model;


public class Player extends Employee implements Profitable {
	
    private String numberShirt;
    private double averageRating;
    private int numberGoals;
    private Position position;

    public Player(String name) {
        super(name);
        this.numberShirt = numberShirt;
        this.averageRating = 0;
        this.numberGoals = numberGoals;
        this.position = position;
    }
		
		  public String getNumberShirt() {
        return numberShirt;
    }

    public void setNumberShirt(String numberShirt) {
        this.numberShirt = numberShirt;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public int getNumberGoals() {
        return numberGoals;
    }

    public void setNumberGoals(int numberGoals) {
        this.numberGoals = numberGoals;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    

}