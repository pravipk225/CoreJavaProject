package collectiondemo;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	private Integer id;
	private String name;
	private Integer deptno;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String name, int deptno) {
		super();
		this.id = id;
		this.name = name;
		this.deptno = deptno;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptno=" + deptno
				+ "]";
	}

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return id.compareTo(emp.id);
	}

	public static Comparator<Employee> nameASCOrder() {
		return new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				// TODO Auto-generated method stub
				return emp1.name.compareTo(emp2.name);
			}
		};
	}
	public static Comparator<Employee> nameDESCOrder() {
		return new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				// TODO Auto-generated method stub
				return emp2.name.compareTo(emp1.name);
			}
		};
	}
	public static Comparator<Employee> deptnoASCnameDESCOrder() {
		return new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				// TODO Auto-generated method stub
				int flag=emp1.deptno.compareTo(emp2.deptno);
				if(flag==0){
					flag=emp2.name.compareTo(emp1.name);
				}
				return emp2.name.compareTo(emp1.name);
			}
		};
	}

}
