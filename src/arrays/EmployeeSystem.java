package arrays;

public class EmployeeSystem {
	
	public  final static void 
	calculatePFAmount(final Employee emps[]){
		double pfRate=14.5;
		for (Employee emp : emps) {
			double pfAmount=(emp.getSalary()/100)*pfRate;
			double netSalary=emp.getSalary()-pfAmount;
			emp.setPfAmount(pfAmount);
			emp.setNetSalary(netSalary);
		}
	}
	public final static void 
	printEmployeeDetails(final Employee emps[]){
		System.out.println("Employee Details:");
		for (Employee emp : emps) {
			System.out.println("Id        : "+emp.getId());
			System.out.println("Name      : "+emp.getName());
			System.out.println("Salary    : Rs "+emp.getSalary());
			System.out.println("PF Amount : Rs "+emp.getPfAmount());
			System.out.println("Net Salary: Rs "+emp.getNetSalary());
			System.out.println("------------------------");
		}
	}

}







