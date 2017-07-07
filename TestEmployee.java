import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee> empData = new ArrayList<Employee>();
		
		int numOfEmp = Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Employees"));
		if (!(numOfEmp > 5)){
			for(int i = 0; i < numOfEmp; i++){
				String empName = JOptionPane.showInputDialog("Enter employee "+ (i+1)+" name");
					for(int x=i; x<=i; x++){
						double empSal = Double.parseDouble(JOptionPane.showInputDialog("Enter " + empName + "s salary"));
						Employee emp = new Employee(empName, empSal);
						empData.add(emp);
						if(emp.verify() == false){
							JOptionPane.showMessageDialog(null, "Enter numbers greater than $1000 and less than $99,999.99");
						}
					}
			}
			System.out.println("Employee \tSalary");
			for(Employee i : empData){
				System.out.println(i.outputEmp());
			}
		}
		
	}

}
