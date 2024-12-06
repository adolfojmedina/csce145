//Adolfo Medina
import java.util.Scanner;

public class Homework4 {
 
	public static final double PI =3.14; //constant for pi
 
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter how many circles you would like to calculate the radius for");
		
		int circles = key.nextInt();
		
		while(circles <= 0) // input validation for number of circles 
		{
			System.out.println("Please enter a valid number of circles");
			circles = key.nextInt();
		}
	
		double [] radius = new double [circles];
		
		for(int i = 0; i < circles; i++)
		{
			System.out.println("Enter the radius of the circles "+ i + "");
			radius[i] = key.nextDouble();
		}
		for(int i = 0; i < circles; i++) // calculating area of circles
		{
			double area = PI*radius[i]*radius[i];
			radius[i] = area;
		}
		
		System.out.println("\nChoose how you would like the circles to be sorted Enter \"Smallest \", \"Largest\"" );
		String choice = key.next();
		
		if(choice.equalsIgnoreCase("Smallest"))
		{
			System.out.println("This is in order from smallest to greatest");
		
			for(int i = 0; i < radius.length; i++) // selection sort for smallest to largest 
			{
			int minIndex = i;
			double smallest = radius[i];
			
			for(int j = i+1; j  < radius.length; j++)
			{
			if(radius[j] < smallest)
			{
					smallest = radius[j];
					minIndex = j;
			}
			}
			if(smallest < radius[i])
			{
				double temp = radius[i];
				radius[i] = radius[minIndex];
				radius[minIndex] = temp;
			}
			}
			for(int i = 0; i < radius.length; i++)
			{
			System.out.println(radius[i]+"");
			}
		}
		else if(choice.equalsIgnoreCase("Largest")) // selection sort for largest to smallest
		{
			System.out.println("This is in order from greatest to smallest");
			for(int i = 0; i < radius.length; i++)
			{
				int maxIndex = i;
				double largest = radius[i];
			
			for(int j = i+1; j  < radius.length; j++)
			{
			if(radius[j] > largest)
			{
				largest = radius[j];
				maxIndex = j;
			}
			}
			if(largest > radius[i])
			{
				double temp = radius[i];
				radius[i] = radius[maxIndex];
				radius[maxIndex] = temp;
			}
			}
			for(int i = 0; i < radius.length; i++)
			{
			System.out.println(radius[i]+"");
			}
		}
		else 
		{
			System.out.println("Invalid sort entry selected!!");
		}
		System.out.println("\nHere are all unique areas in the array");
		for(int i = 0; i < radius.length-1; i++) // eliminating duplicates
		{
			boolean nonDuplicate = true;
			for(int j = 0; j< radius.length; j++)
			{
				if(radius[i] == radius[j] && i != j)
				{
					nonDuplicate = false;
				}
			}
				if(nonDuplicate)
				{
					System.out.println( radius[i]);
				}
		}
		
		
	
	
	
	}

}
