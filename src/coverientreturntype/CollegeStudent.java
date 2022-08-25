package coverientreturntype;

public class CollegeStudent  extends Person{
	@Override
	public void personType() {
		System.out.println("Person: College Student");
		
	}
	public  void showName(String name){
		System.out.println("Name: "+name);
	}
}
