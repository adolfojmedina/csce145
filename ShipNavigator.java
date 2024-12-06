//Adolfo Medina
import java.util.Scanner;
public class ShipNavigator {

	public static void main(String[] args) {
	
		 Scanner key = new Scanner(System.in);
		 boolean run = true;

	        System.out.println("Welcome to ShipNavigator!");

	        while (run ==true) //loop allows user to create additional ship if the choose
	        {
	            System.out.println("Enter the name of the ship:");
	            String name = key.nextLine();

	            System.out.println("Enter its launch date (mm/dd/yyyy):");
	            String launchDate = key.nextLine();

	            System.out.println("Is it a cruise ship or a cargo ship?");
	            String type = key.nextLine();

	            //runs if cruise ship
	            if (type.equalsIgnoreCase("Cruise Ship")) 
	            {
	                System.out.println("Enter the ship's passenger capacity:");
	                int passengers = key.nextInt();
	                System.out.println("How many crew members are on this ship?");
	                int crew = key.nextInt();

	                CruiseShip cruiseShip = new CruiseShip(name, launchDate, passengers, crew);
	                cruiseShip.setPassengers(passengers);
	                cruiseShip.setCrew(crew);

	                System.out.println("Creating a cruise ship");
	                System.out.println("Printing the ship's details:\n" + cruiseShip);

	            } 
	            //runs if cargo ship
	            else if (type.equalsIgnoreCase("Cargo Ship")) 
	            {
	                System.out.println("Enter the ships tonnage:");
	                double tonnage = key.nextDouble();
	                System.out.println("Enter the maximum speed of the ship ");
	                double maxSpeed = key.nextDouble();

	                CargoShip cargoShip = new CargoShip(name, launchDate, tonnage, maxSpeed);
	                cargoShip.setTonnage(tonnage);
	                cargoShip.setMaxSpeed(maxSpeed);

	                System.out.println("Creating a cargo ship.");
	                System.out.println("Printing the ships details:\n" + cargoShip);

	            }
	            else 
	            {
	                System.out.println("Invalid ship enter Cruise Ship or Cargo Ship.");
	            }

	            System.out.print("Do you want to construct another ship object? Enter 'yes' or 'no': ");
	            
	            String input = key.next();
	            if (input.equalsIgnoreCase("no")) 
	            {
	               run = false; //ends while loop
	               System.out.println("Goodbye!");
	            }
	            key.nextLine();
	        }


	}
}
