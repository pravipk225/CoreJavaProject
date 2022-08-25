package inheritance;
public abstract 
class Father {
	private String name;
	public Father() {
		name="Ram Kumar";
	}
	public Father(String name) {
		this.name = name;
	}
	protected void getName(){
		System.out.println("Father: "+name);
	}
	public void  acAmount(){
		System.out.println("Father Amount: Rs 50000000");
	}
	public void A()
	{
		
	}

}








