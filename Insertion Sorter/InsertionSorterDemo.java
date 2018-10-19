
/**
 * 
 * @author Skylar Smoker
 *
 */


import java.util.Scanner;

public class InsertionSorterDemo {
	
	public static void main(String[] args) {
		/**
		 * initialize the variable answer of type int
		 * initialize a new instance of the Scanner class with the reference variable being input
		 */
		int answer;
		
		Scanner input = new Scanner(System.in);
		
		/**
		 * Prompt the user for input that determines the length of the array
		 */
		System.out.println("How big should the array be?");
		/**
		 * Makes sure the program won't crash if the user inputs something unexpected
		 */
		while (!input.hasNextInt()) {
			System.out.println("Please enter an integer.");
			input.next();
		}
		
		int arrayLength = input.nextInt();
		/**
		 * Creates a new instance of the class InsertionSorter with the reference variable being i
		 */
		InsertionSorter i = new InsertionSorter();
		/**
		 * gives the method makeArray the length the user wants the array to be
		 */
		i.makeArray(arrayLength);
		
		System.out.println(i.getArray());
		/**
		 * initializes the menu with a while loop
		 */
		while (true) {
			
			System.out.println();
			System.out.println("1. Sort Ascending");
			System.out.println("2. Sort Descending");
			System.out.println("3. Shuffle");
			System.out.println("4. Quit");
			/**
			 * prevents the program from crashing from unexpected user input
			 */
			while (!input.hasNextInt()) {
				System.out.println("Please enter a valid option.");
				input.next();
			}
			
			answer = input.nextInt();
			
			/**
			 * prevents the program from crashing if user enters invalid number and then
			 * enters something that is not an integer
			 */
			while (answer < 0 || answer > 4) {
				System.out.println("Please enter a valid option.");
				while (!input.hasNextInt()) {
					System.out.println("Please enter a valid option.");
					input.next();
				}
				answer = input.nextInt();
			}
			
			/**
			 * if user enters 1 then access the method sortAscend
			 */
			if (answer ==  1) {
				i.sortAscend();
				System.out.println(i.getArray());
			}
			/**
			 * if user enters 2 then access the method sortDescend
			 */
			if (answer == 2) {
				i.sortDescend();
				System.out.println(i.getArray());
			}
			/**
			 * if user enters 3 then access the method shuffle
			 */
			if (answer == 3) {
				i.shuffle();
				System.out.println(i.getArray());
			}
			/**
			 * if user enters 4 then break the while loop which in return ends the program
			 */	
			if (answer == 4) break;
			
		}
		
		input.close();
		

	}

}
