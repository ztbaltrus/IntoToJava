/** Homework 3 5.4
 * 
 * CIS 2751
 * @version 20JUn2017
 * @author Zachary Baltrus
 *
 */

public class Homework3_5_4 {

	public static void main(String[] args) {
		
		System.out.println("Miles" + "\t" + "Kilometers");
		
		int miles = 1; //Setting miles to 1
		
		while(miles <= 10){ // while loop that will convert miles to kilometers from 1 to 10
			double milToKil = (miles * 1.609);
			System.out.println(miles + "\t" + milToKil);
			miles++;
			
		}

	}

}
