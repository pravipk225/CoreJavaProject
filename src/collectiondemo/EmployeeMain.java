package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(10101, "Smith",10));
		empList.add(new Employee(10112, "Ajay",20));
		empList.add(new Employee(10164, "Manash",20));
		empList.add(new Employee(10104, "Seru",10));
		empList.add(new Employee(10105, "Alok",20));
		EmployeeManager.printEmployeeDetails(empList);
	}

}
