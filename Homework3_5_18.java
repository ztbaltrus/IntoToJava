/** Homework 3 5.18
 * 
 * CIS 2751
 * @version 20JUn2017
 * @author Zachary Baltrus
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Homework3_5_18 {

	public static void main(String[] args) {
		doPatternA();
	}
	public static void doPatternA(){
		
		int patternNum = 1; // setting the integer to 1
		
		List<Integer> list = new ArrayList<>(); //Creating a list to put all of the numbers in for the pattern 
		
		int x = 0;//Setting X to 0 for while loops
		
		while (x==0){ //THis while loop will print out Pattern A
			while (patternNum <= 6){
				list.add(patternNum);
				System.out.println(list);
				patternNum++;
			}
			
			while (x==0 ){
				System.out.println("123456\n123456\n123456\n123456");
				x++;
				
			}
		}
		
	}
	
}
