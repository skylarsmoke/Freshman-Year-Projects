
/**
 * 
 * @author Skylar Smoker
 *
 */

public class Calculator {
	
	/**
	 * initializes the variables firstNum, secondNum, and total as private doubles
	 */
	private double firstNum;
	private double secondNum;
	private double total;
	
	public Calculator() { 
		firstNum = 0;
		secondNum = 0;
		total = 0;
	}
	
	/**
	 * 
	 * @param n1 the first number the user inputs
	 * 
	 */
	public void setFirstVal(double n1) {
		firstNum = n1;
		
	}
	
	/**
	 * 
	 * @param n2 the second number the user inputs. As well as, the number that the user
	 * continues to input throughout the calculator
	 */
	public void setSecVal(double n2) {
		secondNum = n2;
	}
	
	/**
	 * 
	 * @param t the first number the user inputs
	 */
	public void setTotal(double t) {
		total = t;
	}
	
	/**
	 * 
	 * @param sign the sign the user inputs into the calculator
	 */
	public void calc(String sign) {
		switch (sign) {
		case "+": 
			total = firstNum + secondNum;
			break;
		case "-":
			total = firstNum - secondNum;
			break;
		case "*":
			total = firstNum * secondNum;
			break;
		case "/":
			total = firstNum / secondNum;
			break;
		}
		
	}
	
	/**
	 * 
	 * @return returns the total of the calculation
	 */
	public double getTotal() {
		return total;
	}
	
}
