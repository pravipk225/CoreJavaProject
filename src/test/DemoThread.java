package test;

public class DemoThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Test"+Thread.currentThread());
			
		
		for(int i=0;i<3;i++)
		{
			Thread.sleep(5000);
			System.out.println("Last"+Thread.currentThread());
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
