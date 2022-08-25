package coverientreturntype;

public class B extends A{
	@Override
	public CollegeStudent getPerson() {
		return new CollegeStudent();
	}

}
