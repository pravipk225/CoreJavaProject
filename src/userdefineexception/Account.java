package userdefineexception;

public class Account {
	private String acNo;
	private String password;
	private String name;
	private double amount;
	private boolean status;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String acNo, String password, String name, double amount) {
		super();
		this.acNo = acNo;
		this.password = password;
		this.name = name;
		this.amount = amount;
	}

	public String getAcNo() {
		return acNo;
	}

	public void setAcNo(String acNo) {
		this.acNo = acNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
