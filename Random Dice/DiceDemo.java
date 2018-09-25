
/**
 * 
 * @author Skylar Smoker
 * 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class DiceDemo {
	
	public static void main(String[] args) {
		
		/**
		 * initialize input of type Scanner for user input.
		 * initialize variable UserRolls of type int to equal 0.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many rolls would you like to average?");
		
		/**
		 * Assign the next integer given by the user to UserRolls
		 */
		int UserRolls = input.nextInt();
		
		while (UserRolls > 1000 || UserRolls < 1) {
			System.out.println("Please enter a number between 0 and 1000.");
			UserRolls = input.nextInt();
		}
		
		/**
		 * creates new instance of the Dice() method in the Dice class.
		 */
		Dice d = new Dice(UserRolls);
		
		DecimalFormat deci = new DecimalFormat("0.00");
		
		/**
		 * initializes the variable avg of type int and retrieves the average from the
		 * getAvg() method in the Dice class.
		 */
		
		System.out.println("The average of " + UserRolls + " rolls was " + deci.format(d.getAvg()) + ".");
		
		input.close();
		
	}
	
}
