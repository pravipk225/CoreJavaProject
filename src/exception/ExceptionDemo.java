package exception;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter val1: ");
		int val1=scanner.nextInt();
		System.out.println("Enter val2: ");
		int val2=scanner.nextInt();
		try{
		double result=val1/val2;
		System.out.println(val1+"/"+val2+" = "+result);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
			//System.err.println("val2 must be > 0.");
		}
	}

}
