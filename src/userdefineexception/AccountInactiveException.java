package userdefineexception;

public class AccountInactiveException extends Exception{
	public AccountInactiveException(String msg){
		super(msg);
	}
	public AccountInactiveException(Throwable throwable){
		super(throwable);
	}
	public AccountInactiveException(String msg,Throwable throwable){
		super(msg,throwable);
	}
}
