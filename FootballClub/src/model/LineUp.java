package model;

public class LineUp{
 
 private String date;
 private boolean[][] formation;
 
 private Tactics tactics;
 
 public LineUp(){
	 this.date=date;
	 this.formation=formation;
	 this.tactics=tactics;
 }
 
    /**
     * @return String return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return boolean[][] return the formation
     */
    public boolean[][] getFormation() {
        return formation;
    }

    /**
     * @param formation the formation to set
     */
    public void setFormation(boolean[][] formation) {
        this.formation = formation;
    }

    /**
     * @return Tactics return the tactics
     */
    public Tactics getTactics() {
        return tactics;
    }

    /**
     * @param tactics the tactics to set
     */
    public void setTactics(Tactics tactics) {
        this.tactics = tactics;
    }

}