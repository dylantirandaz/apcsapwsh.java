import java.util.Scanner;

public class RoachMotel 
{
	public static void main(String[] args) 
	{

		// Using the default constructor, declare and instantiate a 
		// RoachPopulation object to represent the roach population 
		// in the computer lab. 
		// Display the initial population using the accessor method.
		RoachPopulation initial = new RoachPopulation();
		System.out.println("My lab has an initial population of " + initial.getRoaches()
			+ " roaches");
		System.out.println();
	


		// Using the starting population provided by the user and 1-parameter
		// constructor, declare and instantiate a RoachPopulation object to
		// represent the roach population in your kitchen. 
		// Display initial population using the accessor method.
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter starting population of the kitchen (an integer): ");
		int initialPopulation = scan.nextInt();
		RoachPopulation kitchen = new RoachPopulation(initialPopulation);
		System.out.println("My kitchen has an initial population of " 
			+ kitchen.getRoaches() + " roaches");
		System.out.println();

		// Wait for the kitchen population to double and display the results
		System.out.println("Waiting for the kitchen population to grow.... ");
		kitchen.waitForDoubling();
		System.out.println("My kitchen now has " 
			+ kitchen.getRoaches() + " roaches");
			System.out.println();


		// Wait for the lab population to double and display the results
		System.out.println("Waiting for lab population to grow.... ");
		initial.waitForDoubling();
		System.out.println("My lab now has " 
			+ initial.getRoaches() + " roaches");
			System.out.println();


		
	}
}
