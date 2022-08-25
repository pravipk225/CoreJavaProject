package equalhashcode;

public class Employee {
	private Integer empno;
	private String name;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empno, String name) {
		super();
		this.empno = empno;
		this.name = name;
	}
	public void showDetails(){
		System.out.println("Emp Details: ");
		System.out.println("Empno  : "+empno);
		System.out.println("Name   : "+name);
	}
	@Override
	public boolean equals(Object obj) {
		boolean flag=false;
		if(obj instanceof Employee){
			Employee emp=(Employee) obj;
			if(empno.equals(emp.empno)){
				flag=true;
			}
		}
		return flag;
	}
	@Override
	public int hashCode() {
		return empno;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + "]";
	}
	
}
















