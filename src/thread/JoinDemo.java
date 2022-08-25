package thread;

public class JoinDemo {
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3= new Employee();
		Thread t1=new Thread(e1); // Object register inside thread
		t1.setName("Thread-1");
		Thread t2=new Thread(e2);
		t2.setName("Thread-2");
		Thread t3=new Thread(e3);
		t3.setName("Thread-3");
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Exit...");
		
		
	}

}
