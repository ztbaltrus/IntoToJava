import javax.swing.JOptionPane;
/**Homework 2 
 * 
 * CIS 2751
 * @author Zachary Baltrus
 * @version 13Jun2017
 *
 */
public class Homework2 {

	public static void main(String[] args) {
		new Homework2().doProblem1();
		new Homework2().doProblem2();
		}

	private void doProblem1() {
		
		double IntChoice = Double.parseDouble(JOptionPane.showInputDialog("Enter an integer: "));
		
		if (IntChoice % 5 == 0 && IntChoice % 6 == 0)  {
			String DivisibleByBoth = ("True");
			JOptionPane.showMessageDialog(null, "Is " + IntChoice + " divisible by 5 and 6? " + DivisibleByBoth);
		}
		else {
			String DivisibleByBoth = ("False");
			JOptionPane.showMessageDialog(null, "Is " + IntChoice + " divisible by 5 and 6? " + DivisibleByBoth);
		}
		
		
		if (IntChoice % 5 == 0 || IntChoice % 6 == 0) {
			String EitherDivisible = ("True");
			JOptionPane.showMessageDialog(null, "Is " + IntChoice + " divisible by 5 or 6? " + EitherDivisible);
		}
		else {
			String EitherDivisible = ("False");
			JOptionPane.showMessageDialog(null, "Is " + IntChoice + " divisible by 5 or 6? " + EitherDivisible);
		}
		
		if (IntChoice % 5 == 0 ^ IntChoice % 6 == 0) {
			String EitherDivisible = ("True");
			JOptionPane.showMessageDialog(null, "Is " + IntChoice + " divisible by 5 or 6, but not both? " + EitherDivisible);
		}
		else {
			String EitherDivisible = ("False");
			JOptionPane.showMessageDialog(null, "Is " + IntChoice + " divisible by 5 or 6, but not both? " + EitherDivisible);
		}
		
		
		
	}
	
	private void doProblem2() {
		
		String package1 = JOptionPane.showInputDialog("Enter the weight and price of package 1: ");
		String package2 = JOptionPane.showInputDialog("Enter the weight and price of package 2: ");
		
		String[] package1Info = package1.split(" ");
		String[] package2Info = package2.split(" ");

		String weight1info = package1Info[0];
		double weight1 = Double.parseDouble(weight1info);
		String price1info = package1Info[1];
		double price1 = Double.parseDouble(price1info);
		
		
		String weight2info = package2Info[0];
		double weight2 = Double.parseDouble(weight2info);
		String price2info = package2Info[1];
		double price2 = Double.parseDouble(price2info);
		
		double package1Value = (price1 / weight1);
		double package2Value = (price2 / weight2);
		
		
		if (package1Value < package2Value){
			JOptionPane.showMessageDialog(null, "Package 1 has the better price.");
		}
		else if (package1Value == package2Value){
			JOptionPane.showMessageDialog(null, "The two packages have the same price.");
		}
		else{
			JOptionPane.showMessageDialog(null, "Package 2 has the better price");
		}
		
		
	}

	}

