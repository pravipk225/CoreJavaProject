package abstractex;

public class Pat extends Cognizant{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void rules() {
		System.out.println("PAT rules.");
		
	}

}
