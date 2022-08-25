package thread;

public class SyncExample {
	
	public static void main(String[] args) {
		Printer printer=new Printer();
		PrinterSystem ps1=new PrinterSystem("Ajay","Pandey",printer);
		
		PrinterSystem ps2=new PrinterSystem("Shashank","Kumar",printer);
		
		PrinterSystem ps3=new PrinterSystem("Sonia","Roy",printer);
		
		ps2.setPrinter(printer);
		ps1.setPrinter(printer);
		ps3.setPrinter(printer);
		
		Thread t1=new Thread(ps1);	
		t1.setName("PrinterSystem-1");
		
		Thread t2=new Thread(ps2);
		t2.setName("PrinterSystem-2");
		
		Thread t3=new Thread(ps3);
		t3.setName("PrinterSystem-3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
