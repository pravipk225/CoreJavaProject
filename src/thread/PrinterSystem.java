package thread;

public class PrinterSystem implements Runnable{
	private String fname;
	private String lname;
	private Printer printer;
	private Thread thread;
	
	public PrinterSystem() {
		// TODO Auto-generated constructor stub
	}
	/*public PrinterSystem(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
		thread=new Thread(this);
		thread.start();
	}*/
	public PrinterSystem(String fname, String lname,Printer printer) {
		this.printer=printer;
		this.fname = fname;
		this.lname = lname;
		thread=new Thread(this);
		thread.start();
	}
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	@Override
	public void run() {
		printer.print(fname, lname);
		
	}
	

}
