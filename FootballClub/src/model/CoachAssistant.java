package model;

public class CoachAssistant extends Coach {
	
    private boolean wasPlayer;

    public CoachAssistant(String name, String identificator, int salary, int experienceYears, boolean wasPlayer){
        super(name, identificator, salary, experienceYears);
        this.wasPlayer = wasPlayer;
    }
    @Override
    public String employeeToString() {
        String msg = super.employeeToString();
        if(wasPlayer){
            msg += "Si fue jugador profesional";
        }else{
            msg += "No fue jugador profesional";
        }
        return msg;
    }

    /**
     * @return boolean return the wasPlayer
     */
    public boolean isWasPlayer() {
        return wasPlayer;
    }

    /**
     * @param wasPlayer the wasPlayer to set
     */
    public void setWasPlayer(boolean wasPlayer) {
        this.wasPlayer = wasPlayer;
    }

}