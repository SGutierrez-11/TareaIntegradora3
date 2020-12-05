package model;

public abstract class Employee {
    private String name; 
    private String identificator; 
    private int salary; 
    private Status status; 

    public Employee(String name) {
        this.name = name;
        this.identificator = identificator;
        this.salary = salary;
    }
		
		public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentificator() {
        return identificator;
    }

    public void setIdentificator(String identificator) {
        this.identificator = identificator;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}