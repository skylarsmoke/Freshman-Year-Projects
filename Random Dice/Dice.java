
/**
 * 
 * @author Skylar Smoker
 *
 */

import java.util.Random;

public class Dice {
	/**
	 * initialize variables
	 */
	private int[] pubRolls;
	private double avg;
	private double sum;
	/**
	 * Initializes rand of type Random to make a new instance of the Random() class.
	 */
	Random rand = new Random();
	
	/**
	 * Initializes the Dice method, which assigns the length of the pubRolls array
	 * and assigns random values from 1-6 for each spot in the array
	 * @param UserRolls the integer entered by the user to determine how many times the dice is rolled.
	 */
	public Dice(int UserRolls) {
		pubRolls = new int[UserRolls];
		for (int i = 0; i < pubRolls.length; i++) {
			int x = rand.nextInt(6) + 1;
			pubRolls[i] = x;
			
		}
	}
	
	
	/**
	 * Initializes the getAvg method which uses a for loop to add up each element
	 * of the array pubRolls and then finds the average by dividing by the length of 
	 * the array.
	 * @return returns the average number rolled
	 */
	public double getAvg() {
		for (int i = 0; i < pubRolls.length; i++) {
			sum = sum + pubRolls[i];
		}
		avg = (sum / pubRolls.length);
		return avg;
	}
	
}
