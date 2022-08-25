package test;

public class DemoT {
public static void main(String[] args) {
	DemoThread t1 = new DemoThread();
	t1.setName("Praveen 1");
	t1.start();
	DemoThread t2 = new DemoThread();
	t2.start();
	DemoThread t3 = new DemoThread();
	t3.start();
	
}
}
