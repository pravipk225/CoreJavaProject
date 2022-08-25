package objectcasting;

public class Human extends Animal {
	public void name(){
		System.out.println("Human: Ram");
	}
	@Override
	public void nature() {
	 System.out.println("Social Animal");
		
	}

}
