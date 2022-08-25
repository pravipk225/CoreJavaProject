package thread;

public class MultiThreadingDemo {
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		t1.setName("Thread-1");
		MyThread t2=new MyThread();
		t1.setName("Thread-2");
		MyThread t3=new MyThread();
		t1.setName("Thread-3");
		t1.start();
		t2.start();
		t3.start();
	}

}
