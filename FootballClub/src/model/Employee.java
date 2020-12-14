package model;

public abstract class Employee {
    private String name; 
    private String identificator; 
    private int salary; 

    public Employee(String name, String identificator, int salary) {
        this.name = name;
        this.identificator = identificator;
        this.salary = salary;
    }

    public String employeeToString(){
        String msg ="Nombre: "+name+"\n"+
                    "Numero de ID: "+identificator+"\n"+
                    "Salario: "+salary+"\n";
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
     * @return String return the identificator
     */
    public String getIdentificator() {
        return identificator;
    }

    /**
     * @param identificator the identificator to set
     */
    public void setIdentificator(String identificator) {
        this.identificator = identificator;
    }

    /**
     * @return int return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

}