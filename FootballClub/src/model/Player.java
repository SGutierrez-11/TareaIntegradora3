package model;


public class Player extends Employee implements Profitable {
	
    private String numberShirt;
    private double averageRating;
    private int numberGoals;
    private Position position;

    public Player(String name, String identificator, int salary, String numberShirt, int numberGoals, String position) {
        super(name, identificator, salary);
        this.numberShirt = numberShirt;
        this.averageRating = 0;
        this.numberGoals = numberGoals;
        Position aPosition = Position.valueOf(position);
        this.position = aPosition;
    }

    @Override
    public String employeeToString() {
        String msg = super.employeeToString();

        msg += "Posicion: " + position + "\n" 
            + "Numero de camiseta: " + numberShirt + "\n" 
            + "Promedio del jugador: "+ averageRating + "\n" 
            + "Cantidad de goles: " + numberGoals;
        return msg;
    }

    /**
     * @return String return the numberShirt
     */
    public String getNumberShirt() {
        return numberShirt;
    }

    /**
     * @param numberShirt the numberShirt to set
     */
    public void setNumberShirt(String numberShirt) {
        this.numberShirt = numberShirt;
    }

    /**
     * @return double return the averageRating
     */
    public double getAverageRating() {
        return averageRating;
    }

    /**
     * @param averageRating the averageRating to set
     */
    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    /**
     * @return int return the numberGoals
     */
    public int getNumberGoals() {
        return numberGoals;
    }

    /**
     * @param numberGoals the numberGoals to set
     */
    public void setNumberGoals(int numberGoals) {
        this.numberGoals = numberGoals;
    }

    /**
     * @return Position return the position
     */
    public Position getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Position position) {
        this.position = position;
    }

}