package coverientreturntype;

public class A {
	public Person getPerson(){
		return new SchoolStudent();
	}

}
