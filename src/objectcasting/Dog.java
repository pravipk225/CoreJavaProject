package objectcasting;

public class Dog  extends Animal{
	public void name(){
		System.out.println("Dog: Tommy");
	}
	@Override
	public void nature() {
		System.out.println("Domestic Animal");
		
	}

}
