package thread;

public class ThreadImplimantationDemo {
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3= new Employee();
		Thread t1=new Thread(e1); // Object register inside thread
		t1.setName("Thred-1");
		Thread t2=new Thread(e2);
		t2.setName("Thred-2");
		Thread t3=new Thread(e3);
		t3.setName("Thred-3");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Main Exit...");
		
		
	}

}
