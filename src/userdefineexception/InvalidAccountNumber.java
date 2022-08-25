package userdefineexception;

public class InvalidAccountNumber extends Exception{
	public InvalidAccountNumber(String msg){
		super(msg);
	}
	public InvalidAccountNumber(Throwable throwable){
		super(throwable);
	}
	public InvalidAccountNumber(String msg,Throwable throwable){
		super(msg,throwable);
	}

}
