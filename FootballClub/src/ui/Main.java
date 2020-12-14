package ui;
import model.*;
import java.util.Scanner;

public class Main{
		
	
	private Club club;
	private Scanner sc;
	
	public Main(){
		
		this.sc = new Scanner(System.in);
		club = new Club("LSA", "123","23/12/1920");
	}
	
	public static void main(String[] args){
	
			int option = 0;
			System.out.println("Bienvenidos a Football Club App");
			Main main = new Main();

			do{
				
				option = main.showMenu();
				main.executeOperation(option);
				
			}while(option!=0);
		
	}
	
	public int showMenu(){
		
		int option = 0;
		
		System.out.println("Digite la opcion a realizar: \n" +
						   "(0) Para salir de la aplicacion \n" +
						   "(1) Añadir jugador \n" +
						   "(2) Añadir entrenador principal \n"+
						   "(3) Añadir entrenador asistente \n"+
						   "(4) Mostrar información de algún club ");
		option = sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int option){
        switch(option){
					
			case 0:
				System.out.println("Hasta la proxima!");
				break;
            case 1:
				addPlayer();
            	break;
            case 2:
				addMainCoach();
				break;
			case 3:
				addCoach();
			case 4: 
				showInfo();
				break;
        }
    }
	
	

	public void addPlayer(){
		
		
		String position = "";
		System.out.println("Ingrese los siguientes campos");
		System.out.println("A que equipo pertence (Team A: 1 - Team B: 2)");
		int team = sc.nextInt();
		sc.nextLine();
		System.out.println("Nombre del jugador");
		String name = sc.nextLine();
		System.out.println("ID del jugador");
		String identificator = sc.nextLine();
		System.out.println("Salario del jugador");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Numero de camiseta del jugador");
		String numberShirt = sc.nextLine();
		System.out.println("Cantidad de goles hechos por el jugador");
		int numberGoals = sc.nextInt();
		sc.nextLine();
		System.out.println("Promedio del jugador");
		double average = sc.nextDouble();
		System.out.print("Posicion del Jugador: \n" +
						"(1) Portero\n" +
						"(2) Defensor\n" +
						"(3) Volante\n" +
						"(4) Delantero\n");
		int option = sc.nextInt();
		sc.nextLine();
		switch(option){
			case 1:
				position = "GOALKEEPER";
				break;
			case 2:
				position = "DEFENDER";
				break;
			case 3:
				position = "MIDFIELD";
				break;
			case 4:
				position = "STRIKER";
				break;
		}	

		club.addPlayer(team, name, identificator, salary, numberShirt, numberGoals, position);

	}
	
	
	public void addMainCoach(){


		System.out.println("A que equipo pertence (Team A: 1 - Team B: 2)");
		int team = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese el nombre del entrenador");
		String name = sc.nextLine();
		System.out.println("Ingrese el Id del entrenador");
		String identificator = sc.nextLine();
		System.out.println("Ingrese el salario del entrenador");
		int salary = sc.nextInt();
		System.out.println("Ingrese los años de experiencia del entrenador");
		int experienceYears = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese cuantos equipos ha entrenado anteriormente");
		int teamsThatEncharger = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese cuantas competencias ha ganado anteriormente");
		int wonChampionships = sc.nextInt();
		
		club.addMainCoach(team, name, identificator, salary, experienceYears, teamsThatEncharger, wonChampionships);

	}
	
	public void addCoach(){
		
		boolean wasPlayer=false;

		System.out.println("A que equipo pertence (Team A: 1 - Team B: 2)");
		int team = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese el nombre del entrenador");
		String name = sc.nextLine();
		System.out.println("Ingrese el Id del entrenador");
		String identificator = sc.nextLine();
		System.out.println("Ingrese el salario del entrenador");
		int salary = sc.nextInt();
		System.out.println("Ingrese los años de experiencia del entrenador");
		int experienceYears = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese si el entrenador fue jugador (1) o si no lo fue (2)");
		int aWasPlayer = sc.nextInt();

		switch(aWasPlayer){
			
			case 1:
				wasPlayer = true;
				break;
			case 2:
				wasPlayer = false;
				break;

		}

		club.addCoach(team, name, identificator, salary, experienceYears, wasPlayer);

	}

	public void showInfo(){
		int opt=0;

		System.out.println("Mostrar información del equipo (Team A: 1 - Team B: 2)");
		opt=sc.nextInt();
		System.out.println(club.showInfo(opt));

	}


}