package collectiondemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class EmployeeListDemo {
	
	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(10101, "Smith",10));
		empList.add(new Employee(10112, "Ajay",20));
		empList.add(new Employee(10164, "Manash",20));
		empList.add(new Employee(10104, "Seru",10));
		empList.add(new Employee(10105, "Alok",20));
		
		
		
		//Collections.sort(empList, (a1,a2)->a1.getName().compareTo(a2.getName()));
		
		empList = empList.stream().sorted((a1,a2)->a1.getName().compareTo(a2.getName())).collect(Collectors.toList());
		
		System.out.println(empList);
		
//		System.out.println("EmpList: "+empList);
//		for (Employee emp : empList) {
//			System.out.println(emp);
//		}
//		
//		System.out.println("EmpList ASC Sort name: ");
//		Collections.sort(empList,Employee.nameASCOrder());
//		for (Employee emp : empList) {
//			System.out.println(emp);
//		}
//		System.out.println("EmpList DESC Sort name: ");
//		Collections.sort(empList,Employee.nameDESCOrder());
//		for (Employee emp : empList) {
//			System.out.println(emp);
//		}
//		
//		System.out.println("EmpList deptno ASC name DESC Sort");
//		Collections.sort(empList,Employee.deptnoASCnameDESCOrder());
//		for (Employee emp : empList) {
//			System.out.println(emp);
//		}
	}

}
