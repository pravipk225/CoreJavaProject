package coverientreturntype;

public class Main {
	public static void main(String[] args) {
		B b=new B();
		b.getPerson().personType();
		b.getPerson().showName("Ajay");
		System.out.println();
	}

}
