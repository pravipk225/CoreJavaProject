package encapsulation;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private int deptno;
	private int pfRate=15;
	private double pfAmount;
	private double netSalary;
	private void calculateNetSalary(){
		pfAmount=(salary/100)*pfRate;
		netSalary=(salary-pfAmount);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getPfRate() {
		return pfRate;
	}
	
	public double getPfAmount() {
		return pfAmount;
	}
	public double getNetSalary() {
		calculateNetSalary();
		return netSalary;
	}
	public void showEmployeeDetails(){
		calculateNetSalary();
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
