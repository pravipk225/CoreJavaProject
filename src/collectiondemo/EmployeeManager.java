package collectiondemo;

import java.util.List;

public class EmployeeManager {
	public static void printEmployeeDetails(List<Employee> empList){
		System.out.println("Employee Details:");
		for (Employee employee : empList) {
			System.out.println("Id   : "+employee.getId());
			System.out.println("Name  : "+employee.getName());
			System.out.println("Deptno: "+employee.getDeptno());
			System.out.println("-------------------------");
		}
	}

}
