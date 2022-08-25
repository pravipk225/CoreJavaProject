package userdefineexception;

public class BankingSystem {
	public  static void checkUser(String acNo,String password)
	throws InvalidAccountNumber,AccountInactiveException{
		Account account=new Account();
		account.setAcNo(acNo);
		account.setPassword(password);
		String msg=null;
		if(!checkAccountId(account)){
			msg="Sorry "+acNo+" Account Number Is Invalid.";
			throw new InvalidAccountNumber(msg);
		}else{
			Account ac=checkAccountStatus(account);
			if(!ac.isStatus()){
				msg="Sorry "+ac.getName()+" Your Account Number Is Blocked.\nPls Contact With Home Branch.";
				throw new AccountInactiveException(msg);
			}
		}
		
	}
	private static boolean checkAccountId(Account account){
		boolean flag=false;
		for(Account ac:BankDB.getAllBankAccount()){
			if(ac.getAcNo().equals(account.getAcNo())){
				flag=true;
				break;
			}
		}
		return flag;
	}
	private static Account checkAccountStatus(Account account){
		for(Account ac:BankDB.getAllBankAccount()){
			if(ac.getAcNo().equals(account.getAcNo())){
				account=ac;
				break;
			}
		}
		return account;
	}
}
