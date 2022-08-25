package thread;

public class Employee implements Runnable{

	@Override
	public void run() {
		Thread thread=Thread.currentThread();
		for(int i=1;i<=5;i++){
			System.out.println(thread.getName()+" say Welcome To Cognizant "+i+"times");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
