package thread;

public class MultiThreadingDemo1 {
	public static void main(String[] args) {
		Person ram=new Person();
		ram.setName("Ram Kumar");
		Person sam=new Person();
		sam.setName("Sam Kumar");
		Person sita=new Person();
		sita.setName("Sita Kumari");
		ram.start();
		sam.start();
		sita.start();
	}

}
