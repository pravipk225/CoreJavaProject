package staticexample;

public class Test {
	private int x;
	private static int y;
	public Test() {
		x++;
		y++;
		System.out.println("x: "+x+" y: "+y);
	}
}
