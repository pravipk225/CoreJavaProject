package thread;

public class Printer {
	/*public static synchronized void  print(String fname,String lname){
		Thread thread=Thread.currentThread();
		System.out.print(thread.getName()+"  ["+fname);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(" "+lname+"]");
		System.out.println("");
		
	}*/
	public synchronized void  print(String fname,String lname){
		Thread thread=Thread.currentThread();
		System.out.print(thread.getName()+"  ["+fname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(" "+lname+"]");
		System.out.println("");
		
	}

}
