package objectcasting;

public class CastingExampleMain {
	public static void main(String[] args) {
		 CastingExampleMain cem=new CastingExampleMain();
		 Human ram=new Human();
		 Dog dog=new Dog();
		 cem.printAnimalNature(ram);
	}
	public void printAnimalNature(Animal a){
		a.nature();
		if(a instanceof Human){
			Human hobj=(Human) a;// DownCast;
			hobj.name();
		}
		if(a instanceof Dog){
			Dog dobj=(Dog) a;// DownCast;
			dobj.name();
		}
		
	}

}







