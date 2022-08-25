package thread;

public class Person extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++){
			System.out.println(getName()+" say Welcome To Cognizant "+i+"times");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
