
public class Employee {
	int id;
	String name;
	double salary;
	int deptno;
	int pfRate=15;
	double pfAmount;
	double calculateNetSalary(){
		pfAmount=(salary/100)*pfRate;
		double netSalary=(salary-pfAmount);
		return netSalary;
	}
	void showEmployeeDetails(){
		double netSalary=calculateNetSalary();
		System.out.println("Employee Details:");
		System.out.println("Id           : "+id);
		System.out.println("Name         : "+name);
		System.out.println("Department Id: "+deptno);
		System.out.println("Gross Salary : Rs "+salary);
		System.out.println("PF Rate      : "+pfRate+"%");
		System.out.println("PF Amount    : Rs "+pfAmount);
		System.out.println("Net Salary   : Rs "+netSalary);
	}

}
