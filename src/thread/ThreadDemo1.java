package thread;

public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread thread=Thread.currentThread();
		MyThread t1=new MyThread();
		t1.setName("Child Thread-1");
		t1.start();
		for(int i=1;i<=5;i++){
			System.out.println(thread.getName()+" : i= "+i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Main Exit..");
	}

}
