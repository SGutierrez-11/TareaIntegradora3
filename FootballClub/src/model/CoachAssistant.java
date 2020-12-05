package model;

public class CoachAssistant extends Coach {
	
    private boolean wasPlayer;

    public CoachAssistant(String name){
        super(name);
        this.wasPlayer = wasPlayer;
    }

    public boolean getWasPlayer() {
        return wasPlayer;
    }

    public void setWasPlayer(boolean wasPlayer) {
        this.wasPlayer = wasPlayer;
    }
}