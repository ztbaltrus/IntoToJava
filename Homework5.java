/**Homework 5 7.8
 * 
 * CIS 2751
 * @author Zachary Baltrus
 * @version 27Jun2017
 * 
 */
import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner inputNumber = new Scanner(System.in);
		double[] array = new double[11];
		for(int x = 1; x < array.length; x++ ){
			System.out.println("Enter number " + x);
			array[x] = inputNumber.nextDouble();
			}
		inputNumber.close();
		System.out.println("The average is " + average(array));
	}//End of main method
	public static int average(int[] array) {
		int sum = 0;
		for(int x = 0; x < array.length; x++){
			sum += array[x];
		}
		return sum/array.length;
	}//End of average method for ints
	public static double average(double[] array){
		double sum = 0;
		for(int x = 0; x < array.length; x++){
			sum += array[x];
		}
		return sum/array.length;
	}//End of average method for doubles
}//End of class
