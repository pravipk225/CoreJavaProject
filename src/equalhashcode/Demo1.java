package equalhashcode;

public class Demo1 {
	public static void main(String[] args) {
		String name1=new String("Ajay");
		String name2=new String("Ajay");
		System.out.println("name1==name2: "+(name1==name2));
		System.out.println("name1.equals(name2): "+(name1.equals(name2)));
	}

}
