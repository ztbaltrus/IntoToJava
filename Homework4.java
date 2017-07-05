/**Homework 4
 * 
 * CIS 2751
 * @author Zachary Baltrus
 * @version 22Jun2017
 */
public class Homework4 {

	public static void main(String[] args) {
	displaySortedNumbers();
	footToMeter(0);
	meterToFoot(0);
	}
	
	private static void displaySortedNumbers() {
		// Homework 4 6.5
		java.util.Scanner numInput = new java.util.Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int num1 = numInput.nextInt();
		int num2 = numInput.nextInt();
		int num3 = numInput.nextInt();
		
		if(num1 > num2){ // will check if number 1 is greater then number 2. if so they will switch places.
			int x = num1;
			num1 = num2;
			num2 = x;
		}
		if(num2 > num3){ // will check if number 2 is greater than 3. if it is then they will switch places
			int x = num2;
			num2 = num3;
			num3 = x;
		}
		if(num1 > num2){ // The program will then check if the int num1 is greater then num2. if so they will switch places.
			int x = num1;
			num1 = num2;
			num2 = x;
		}
		
		System.out.println("The sorted numbers are " + num1 + " " + num2 + " " + num3); // Printing out the sorted numbers
		
		
	} // End of displaySortedNumbers
	
	private static void footToMeter(double foot) {
		// This will convert foot to meters by an increment 1 until it hits 10
		System.out.println("\nFoot \tMeters");
		for(foot = 1; foot <= 10; foot++){
			double meter = foot * 0.305;
			System.out.println(foot + "\t" + meter);
		}
		
	}
	
	private static void meterToFoot(double meter) {
		// This will convert meters to foot starting at 20 and going up by 5 until it hits 65.
		System.out.println("\nMeters \tFoot");
		for(meter = 20; meter <= 65; meter+=5){
			double foot = meter * 3.279;
			System.out.println(meter + "\t" + foot);
		}
			
	}

}// End of class
