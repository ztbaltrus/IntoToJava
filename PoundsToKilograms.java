/**Homework 1: 2.4 Pounds to kilograms 
 * 
 * CIS 2751-001
 * @author Zachary Baltrus
 * @version 08Jun2017
 *
 */

import java.util.Scanner; // Importing the scanner function 

public class PoundsToKilograms {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // Using the scanner to create the use of input statements 
		
		// Declaring the integers 
		System.out.println("Enter a number in pounds: "); // Getting the amount in pounds
		double pounds = input.nextDouble(); // Input statement 
		
		double ConversionReslut = pounds * .454; // Pound to kilogram conversion 
		
		System.out.println(pounds + " pounds is " + ConversionReslut); // Final output statement 

	}//END OF MAIN

}//END OF CLASS
