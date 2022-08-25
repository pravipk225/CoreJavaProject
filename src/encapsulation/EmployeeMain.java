package encapsulation;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.setId(101010);
		emp1.setName("Shashank");
		emp1.setSalary(50000);
		emp1.setDeptno(10);
		emp1.showEmployeeDetails();
	}

}
