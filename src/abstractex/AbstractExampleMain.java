package abstractex;

public class AbstractExampleMain {
	public static void main(String[] args) {
		Manager mgr=new Manager();
		Pat pat=new Pat();
		mgr.setName("Jon");
		pat.setName("Milan Kundu");
		System.out.println("Name: "+mgr.getName());
		mgr.rules();
		System.out.println("Name: "+pat.getName());
		pat.rules();
		
	}

}
