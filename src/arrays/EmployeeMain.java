package arrays;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee empArray[]=new Employee[3];
		Employee e1=new Employee(101010, "Ajay", 50000);
		Employee e2=new Employee(202020, "Sanjay", 35000);
		Employee e3=new Employee(303030, "Milan", 68000);
		empArray[0]=e1;
		empArray[1]=e2;
		empArray[2]=e3;
		EmployeeSystem.calculatePFAmount(empArray);
		EmployeeSystem.printEmployeeDetails(empArray);
	}

}
