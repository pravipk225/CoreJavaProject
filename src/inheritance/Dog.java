package inheritance;

public class Dog extends Animal{
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public void showName(){
		System.out.println("Name: "+name);
	}
}
