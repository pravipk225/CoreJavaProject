
public class EmployeeMain {
	public static void main(String[] args) {
		Employee empAjay=new Employee();
		Employee empSanjay=new Employee();
		//-------------------------------
		empAjay.id=121212;
		empAjay.name="Ajay";
		empAjay.salary=50000;
		empAjay.deptno=10;
		empAjay.showEmployeeDetails();
		//------------------------------
		empSanjay.id=154874;
		empSanjay.name="Sanjay Kumar";
		empSanjay.salary=75000;
		empSanjay.deptno=20;
		empSanjay.showEmployeeDetails();
	}

}
