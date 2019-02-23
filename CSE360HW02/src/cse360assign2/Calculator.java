/**
 * Author: Matthew Budiman
 * Class ID: 339
 * Assignment #: 2
 * Description: This file declares a class Calculator that represents a
 *              a calculator with four basic operations: addition,
 *              subtraction, multiplication, and integer division. The class
 *              also provides functionality to store and retrieve the history
 *              of calculations performed using the calculator.
 */

package cse360assign2;

/**
 * This class represents a calculator with four basic operations: addition,
 * subtraction, multiplication, and integer division. The class also provides
 * functionality to store and retrieve the history of calculations performed
 * using the calculator.
 */
public class Calculator {
	private int total;
	
	public Calculator() {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Gets the current total.
	 * @return	the current total
	 */
	public int getTotal() {
		return 0;
	}
	
	/**
	 * Adds a given value to the current total.
	 * @param value	the value to add to the current total
	 */
	public void add(int value) {
		
	}
	
	/**
	 * Subtract a given value to the current total.
	 * @param value the value to subtract from the current total
	 */
	public void subtract(int value) {
		
	}
	
	/**
	 * Multiply the current total by a given value.
	 * @param value	the value by which to multiply the current total
	 */
	public void multiply(int value) {
		
	}
	
	/**
	 * Divides the current total by a given value.
	 * Does integer division. Dividing by 0 sets total to 0.
	 * @param value	the value by which to divide the current total
	 */
	public void divide(int value) {
		
	}
	
	/**
	 * Gets the history of calculations.
	 * @return	the history of calculations as a String
	 */
	public String getHistory() {
		return "";
	}
}
