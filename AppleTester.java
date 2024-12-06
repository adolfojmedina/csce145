//Adolfo Medina
import java.util.Scanner;
public class AppleTester {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
        System.out.println("Welcome to the Apple tester!!!");

        // Creating the first apple with the default constructor
        System.out.println("\nCreating the first apple!");
        Apple a1 = new Apple();

        // Display the default values of the first apple
        System.out.println("Default values of the first apple object:");
        a1.writeOutput();

        // Creating the second apple with user-provided values
        System.out.println("\nEnter the type of the second apple object: Gala, Red Delicious, Golden Delicious or Granny Smith");
        String type = key.nextLine();
        System.out.println("Enter the weight of the second apple object:");
        double weight = key.nextDouble();
        System.out.println("Enter the price of the second apple object:");
        double price = key.nextDouble();

      

        System.out.println("\nCreating the second apple object!");
        Apple a2 = new Apple(type, weight, price);

        // Display the values of the second apple
        System.out.println("Values of the second apple object:");
        	a2.writeOutput();
		
		
		

	}

}
