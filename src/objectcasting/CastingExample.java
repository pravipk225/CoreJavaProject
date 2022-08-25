package objectcasting;

public class CastingExample {
	public static void main(String[] args) {
		Integer iobj=new Integer(150);
		Double dObj=new Double(150.154);
		Number nObj=iobj; //Upcasting
		Integer i=(Integer) nObj; // downcasting
		nObj=dObj; //upcasting
		Double d=(Double) nObj; // downcasting
	}

}
