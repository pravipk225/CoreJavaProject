package thread;

public class MyThread extends Thread{
	 
	 @Override
	public void run() {
		/* 	System.out.println("Thread Details:");
			System.out.println("Id      : "+getId());
			System.out.println("Name    : "+getName());
			System.out.println("Priority: "+getPriority());
			System.out.println("isAlive : "+isAlive());
			System.out.println("Daemon  : "+isDaemon());*/
			for(int i=1;i<=10;i++){
				System.out.println(getName()+" : i= "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}

}








