package test;

public class AnimalMain {
	public static Animal getTiget(){
		return new Animal() {
			@Override
			public void nature() {
				System.out.println("Wild Animal");	
			}
		};
		 
	}
	public static void main(String[] args) {
		
		Animal ram=new Animal() {
			@Override
			public void nature() {
				System.out.println("Social Animal");	
			}
		};
		displayNature(getTiget());
		displayNature(ram);
	}
	public static void displayNature(Animal animal){
		animal.nature();
	}

}
