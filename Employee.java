
public class Employee {
	private String name;
	private double salary;
	
	Employee(){
	}
	
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean verify(){
		if(salary < 1000 || salary > 99999.99){
			return false;
		}
		return true;
	}
	public String outputEmp(){
		String empString = name + "\t\t" + salary;
		return empString;
	}
}
