package coverientreturntype;

public class SchoolStudent extends Person{
	@Override
	public void personType() {
		System.out.println("Person: School Student");
		
	}
	public  void showName(String name){
		System.out.println("Name: "+name);
	}

}
