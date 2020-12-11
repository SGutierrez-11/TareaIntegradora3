package ui;
import model.*;
import java.util.Scanner;

public class Main{
		
	
	private Club club;
	private Scanner sc;
	
	public Main(){
		
		this.sc = new Scanner(System.in);
	
	}
	
	public static void main(String[] args){
	
			int option = 0;
			
			System.out.println("Bienvenidos a Football Club App");
			
			Main main = new Main();
			
			main.createClub();
			
			do{
				
				option = main.showMenu();
				main.executeOperation(option);
				
			}while(option!=0);
		
	}
	
	public int showMenu(){
		
		int option = 0;
		
		System.out.println("Digite la opcion a realizar: \n" +
						   "(0) Para salir de la aplicacion \n" +
							 "(1) Crear club \n"+
						   "(2) Añadir jugador \n" +
						   "(3) Añadir entrenador \n");
		option = sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int option){
        switch(option){
					
						case 0:
								System.out.println("Hasta la proxima!");
            case 1:
                createClub();
            break;
            case 2:
                addPlayer();
            break;
            case 3:
                addTrainer();
            break;
        }
    }
	
	public void createClub(){
	
		
		System.out.println("Nombre del club: ");
		
		String name = sc.nextLine();
		
		System.out.println("Nit del club: ");
		
		String nit = sc.nextLine();
		
		System.out.println("Fecha de fundacion del club: ");
		
		String creationDate = sc.nextLine();
		
		club = new Club(name, nit, null);
		
	}

	public void addPlayer(){
		
	String position = "";

	System.out.println("Nombre del jugador");
	
	String name = sc.nextLine();
	
	System.out.println("ID del jugador");
	
	String id = sc.nextLine();
	
	System.out.println("Salario del jugador");
	
	double salary = sc.nextDouble();
	
	System.out.println("Numero de camiseta del jugador");
	
	int shirtNumber = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("Cantidad de goles hechos por el jugador");
	
	int gols = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("Promedio del jugador");
	
	double average = sc.nextDouble();
	
	System.out.println("Posicion del Jugador: \n" +
					   "(1) Portero\n" +
					   "(2) Defensor\n" +
					   "(3) Volante\n" +
					   "(4) Delantero\n");
	int option = sc.nextInt();
	sc.nextLine();
	switch(option){
		
		case 1:  position = "GOALKEEPER";
		break;
		case 2:  position = "DEFENDER";
		break;
		case 3:  position = "MIDFIELD";
		break;
		case 4: position = "STRIKER";
	}
			
		
	}
	
	
	public void addTrainer(){
	
		System.out.println("Ingrese el nombre del Coach");
		
		String name = sc.nextLine();
		
		System.out.println("Ingrese el Id del coach");
		
		String id = sc.nextLine();
		
		System.out.println("Ingrese el salario del coach");
		
		double salary = sc.nextDouble();
		
		System.out.println("Ingrese los años de experiencia del coach");
		
		int experienceYears = sc.nextInt();
		
		sc.nextLine();
		
	}
}