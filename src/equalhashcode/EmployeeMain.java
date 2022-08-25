package equalhashcode;

import java.util.HashSet;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp1=new Employee(121212, "Ajay");
		Employee emp2=new Employee(121213, "Shashank");
		System.out.println("emp1: "+emp1);
		System.out.println("emp2: "+emp2.toString());
		
		System.out.println("emp1 hashCode: "+emp1.hashCode());
		System.out.println("emp2 hashCode: "+emp2.hashCode());
		System.out.println("emp1==emp2: "+(emp1==emp2));
		System.out.println("emp1.equals(emp2): "+(emp1.equals(emp2)));
		
		HashSet<Integer> intSet=new HashSet<Integer>();
		intSet.add(100);
		intSet.add(100);
		System.out.println("intSet: "+intSet.size());
		HashSet<Employee> empSet=new HashSet<Employee>();
		empSet.add(emp1);
		empSet.add(emp2);
		System.out.println("empSet: "+empSet.size());
		
	}

}








