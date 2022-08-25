package staticexample;

public class A {
	private static int x;
	private int y;
	public A() {
		x++;
		y++;
	}
	public static void display(){
		System.out.println("A class X value: "+x);
	}

}
