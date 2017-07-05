/**Homework 5 7.15
 * 
 * CIS 2751
 * @author Zachary Baltrus
 * @version 27Jun2017
 * 
 */
import java.util.Scanner;

public class Homework_5_7_15 {

	public static void main(String[] args) {
		int[] numberList = new int[10]; //Creating an array
		Scanner numInput = new Scanner(System.in);//New scanner object
		System.out.println("Enter ten numbers");//Print statement 
		for(int x = 0; x < numberList.length; x++){//For loop
			numberList[x] = numInput.nextInt();//Getting each number input
		}
		numInput.close();//closing the input so user 
		arrayOutput(eliminateDuplicates(numberList), numberList.length);//Calling 
		
	}//End of main
	public static int[] eliminateDuplicates(int[] numberList) {
		int temp[] = new int[numberList.length];
		int index = 0;
		for(int x = 0; x < numberList.length; x++){
			boolean isDuplicate = false;
			for(int i = 0; i < numberList.length; i++){
				if(temp[i] == numberList[x]){
					isDuplicate = true;
				}
			}
			if (!isDuplicate) {
                temp[index++] = numberList[x];
            }
		}
		
		int[] newArray = new int[index];
        for (int i = 0; i < index; i++) {
            newArray[i] = temp[i];
        }

        return newArray;
		
	}// End of eliminateDuplicates
	
	public static void arrayOutput(int[] newArray, int numberLine) {
		for (int i = 0; i < newArray.length; i++) {
        	System.out.printf("%2d ", newArray[i]);
		}
	}
	
}//End of class
