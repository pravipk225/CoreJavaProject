package userdefineexception;

public class BankDB {
	public static Account[] getAllBankAccount() {
		Account[] accounts = new Account[5];
		accounts[0] = new Account("SBI101010", "ajay@123", "Ajay Kumar", 5000);
		accounts[0].setStatus(true);
		accounts[1] = new Account("SBI101011", "sanjay@123",
				"Sanjay Kumar Swain", 15000);
		accounts[1].setStatus(false);
		accounts[2] = new Account("SBI101012", "susmita@123", "Susmita Kar",
				6500);
		accounts[2].setStatus(true);
		accounts[3] = new Account("SBI101013", "seru@123", "Shashank Kumar",
				3000);
		accounts[3].setStatus(true);
		accounts[4] = new Account("SBI101014", "milan@123", "Milan Kundu",
				62000);
		accounts[4].setStatus(false);
		return accounts;
	}

}
