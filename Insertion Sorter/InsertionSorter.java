
/**
 * 
 * @author Skylar Smoker
 *
 */

import java.util.Arrays;
import java.util.Random;

public class InsertionSorter {

	/**
	 * initialize the array data of type int
	 */
	private int data[];
	/**
	 * Create a new instance of the class Random()
	 */
	Random rand = new Random();
	
	/**
	 * initialize the method InsertionSorter which initializes data as null
	 */
	public InsertionSorter() {
		data = null;		
	}
	
	/**
	 * initialize the method makeArray which makes the array data to the length given
	 * and then uses a for loop to assign a random number from 1-99 for each item in 
	 * the array.
	 * @param arrayLength The number given by the user the determines the length of the array
	 */
	public void makeArray(int arrayLength) {
		data = new int[arrayLength];
		for (int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt(100);
		}
	}
	
	/**
	 * initializes the method sortAscend which uses a for loop to check if each item in the
	 * array is greater than the one before
	 */
	public void sortAscend() {
		for (int i = 1; i < data.length; i++) {
			int numb = data[i];
			while (i > 0 && data[i-1] > numb) {
				data[i] = data[i-1];
				i--;
			}
			data[i] = numb;
		}
	}
	
	/**
	 * initializes the method sortDescend which uses a for loop to check if each item in the
	 * array is less than the one before.
	 */
	public void sortDescend() {
		for (int i = 1; i < data.length; i++) {
			int numb = data[i];
			while (i > 0 && data[i-1] < numb) {
				data[i] = data[i-1];
				i--;
			}
			data[i] = numb;
		}
	}
	
	/**
	 * initializes the method shuffle which uses a for loop to randomly select an item
	 * in the array and switch it with another and do it for every item.
	 */
	public void shuffle() {
		for (int i = 1; i < data.length; i++) {
			int a = rand.nextInt(i + 1);
			int b = data[a];
			data[a] = data[i];
			data[i] = b;	
		}
	}
	
	/**
	 * initializes the method getArray
	 * @return Returns the array "data"
	 */
	public String getArray() {
		return Arrays.toString(data);
	}
	
}
