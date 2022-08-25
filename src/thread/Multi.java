package thread;

class Multi extends Thread {

	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		Multi t1 = new Multi();
		Multi t2 = new Multi();
		Multi t6 = new Multi();
		Multi t3 = new Multi();
		Multi t4 = new Multi();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t6.start();
	}
}