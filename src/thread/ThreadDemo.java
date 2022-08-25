package thread;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("Thread Details:");
		System.out.println("Id      : "+t.getId());
		System.out.println("Name    : "+t.getName());
		System.out.println("Priority: "+t.getPriority());
		System.out.println("isAlive : "+t.isAlive());
		System.out.println("Daemon  : "+t.isDaemon());
		MyThread thread=new MyThread();
		thread.setName("Child Thread-1");
		thread.start();
	}

}
