import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		
		//create scanner 
		Scanner scan = new Scanner(System.in);
		
		//create variables for the number they choose, if they say they want to continue
		// create variables for number squared and cubed
		int userChoice;
		String saidYes;
		int iSquared;
		int iCubed;
		
		//display table of squares and cubes from 1 to value entered.
		
		
		do {
			//Intro
			
			System.out.println("Learn your squares and cubes!");
			
			//format the title header and under the header
			System.out.printf("%-10s %-10s %-10s\n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s %-10s %-10s\n", "=======", "=======", "=======");
					
			//prompt the user to enter an integer	
			System.out.println("Enter an integer: ");
			userChoice = scan.nextInt();
			scan.nextLine();
			
		
		// we had to include the for loop because the user was going to start from 1 and continue	
		for (int i = 1; (i <= userChoice); i++ ) {

		// make the variable do the equation to get squared
		// make the variable do the equation to get cubed
		iSquared = (int) (Math.pow(i, 2));
		iCubed = (int) Math.pow(i, 3);
		System.out.printf("%-10s %-10s %-10s\n", i, iSquared, iCubed);
		}
		//Ask if user wants to continue
		System.out.println("Do you want to continue? (y/n)");
		saidYes = scan.nextLine();
		
		} while (saidYes.equalsIgnoreCase("y")); //end statement of loop = to yes
		
		//say a goodbye statement
		
		System.out.println("Thank you for using our program. Goodbye!");
}
}
		

