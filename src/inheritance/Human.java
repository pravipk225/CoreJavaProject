package inheritance;

public class Human extends Animal{
	private String name;
	
	@Override
	public void nature() {
		System.out.println("Nature: Social Animal");
	}
	public void setName(String name) {
		this.name = name;
	}
	public void showName(){
		System.out.println("Name: "+name);
	}

}
