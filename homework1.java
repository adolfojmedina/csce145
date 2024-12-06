//Adolfo Medina
import java.util.Scanner; //imported scanner to receive user input

public class homework1 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter Your First and last name");
		
		String name = key.nextLine();
		
		System.out.println("Enter your age");
		
		int age = key.nextInt();
		
		int dob = 2024 - age; // subtracting current age from year
		
		System.out.println("Enter Your phone number with out any () or -");
		
		key.nextLine(); //consume nextline
		
		String phone = key.nextLine();
		
		String phone1 = phone.substring(0,3);  
		
		String phone2 = phone.substring(3,6);
		
		String phone3 = phone.substring(6);
		
		System.out.println("Enter what year of college you're in");
		
		String college = key.nextLine();
		
		System.out.println("Enter your major");
		
		String major = key.nextLine();
		
		System.out.println("Enter your favorite movie");
		
		String movie = key.nextLine();
		
		System.out.println("enter favorite hobby");
		
		String hobby = key.nextLine();
		
		System.out.println("Enter your favorite sports team");
		
		String sports = key.nextLine(); 
		
		System.out.println("Enter todays date using the format mm/dd/yyyy");
		
		String date = key.nextLine();
		
		String date1 = date.substring(0,2); //created substrings for date
		
		String date2 = date.substring(3,5);
		
		String date3 = date.substring(6);
		
		
		
		System.out.println("Here is a quick intro for " + name +""); //printing user entered input to console
		
		System.out.print("You were born in the year " + dob + ".");
		System.out.print("In your free time, you love to");
		System.out.println(" watch the " + sports +"" );
		System.out.print("and catch up on films, with " + movie +"");
		System.out.println(" being one of your favorites. Your favorite");
		System.out.print("way to spend a day is " + hobby +".");
		System.out.println(" You are a " + college +" at USC");
		System.out.print("majoring in  " + major +".");
		System.out.println("You can be reached at (" + phone1 + ")" + phone2 + "-"+  phone3 + " you");
		System.out.println("are now officially a gamecock.");
		
		
		System.out.println("Last updated: " + date1 +"."+ date2 +"."+ date3 +""); //used concatenated substrings to rearrange date.
		
		
		
		
		
		
		
		
		

}
}