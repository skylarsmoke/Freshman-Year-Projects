
/**
 * 
 * @author Skylar Smoker
 *
 */

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		/**
		 * initialize the variables number1 and number 2 as type double and sign as type string
		 */
		double number1 = 0;
		double number2 = 0;
		String sign = "";
		/**
		 * initialize a new scanner called input for user input
		 * initialize a new instance of the Calculator class
		 */
		Scanner input = new Scanner(System.in);
		Calculator c = new Calculator();
		
		System.out.print("Enter number: ");
		/**
		 * while loop that whenever the first number entered isn't a double then it will inform
		 * the user it needs a number
		 */
		while (!input.hasNextDouble()) {
			System.out.println("Please enter a number: ");
			input.nextLine();
		}
		
		number1 = input.nextDouble();
			
		System.out.println("Total is now : " + number1);
		/**
		 * uses the method setFirstVal in the calculator class to assign number1 to the first number
		 * sets the total to the first number
		 */
		c.setFirstVal(number1);
		c.setTotal(number1);
		
		/**
		 * a while loop that continues the calculator until the user ends it
		 */
		while (true) {
			System.out.println("+, -, *, /, or =: ");
			
			sign = input.next();
			
			/**
			 * if the user inputs an "=" then the while loop breaks
			 */
			if (sign.equals("=")) break;
			
			/**
			 * if the user gives anything but a math sign it will ask for the user to enter a sign 
			 */
			while (!sign.equals("+") && !sign.equals("-") && !sign.equals("*") && !sign.equals("/")) {
				System.out.println("Please enter a sign: ");
				sign = input.next();
			}
			
			
			System.out.println("Enter number: ");
			
			while (!input.hasNextDouble()) {
				System.out.println("Please enter a number: ");
				input.next();
			}
			
			number2 = input.nextDouble();
			/**
			 * while loop that won't let users divide by zero
			 */
			while (sign.equals("/") && number2 == 0) {
				System.out.println("Please enter number that's not zero: ");
				number2 = input.nextDouble();
			}
			/**
			 * uses methods from the calculator class to give values for calculation
			 */
			c.setSecVal(number2);
			
			c.calc(sign);
			
			c.setFirstVal(c.getTotal());
					
			System.out.println("Total is now: " + c.getTotal());
			
		}
		
		System.out.println("Total is now: " + c.getTotal());
		
		input.close();
			
	}
			
			
			
}
		