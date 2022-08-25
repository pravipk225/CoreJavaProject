package inheritance;

public class Child extends Father{
	private String name;
    public Child() {
		name="Sam Kumar";
	}
	public Child(String name) {
		this.name = name;
	}
	public Child(String name,String fname) {
		super(fname);
		this.name = name;
	}
	public void getName(){
		super.getName();
		System.out.println("Child: "+name);
	}
	
	@Override
	public void  acAmount(){
	    super.acAmount();
		System.out.println("Child Amount: Rs 5000");
	}
	
	public void B()
	{
		
	}

}
