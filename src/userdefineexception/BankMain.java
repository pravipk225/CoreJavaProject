package userdefineexception;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome To Abc Bank.");
		System.out.println("Login:");
		System.out.println("Account No: ");
		String acNo=scanner.nextLine();
		System.out.println("Password: ");
		String password=scanner.nextLine();
		try {
			BankingSystem.checkUser(acNo, password);
			System.out.println(acNo+" Welcome to Abc bank.");
		} catch (InvalidAccountNumber e) {
			System.err.println(e.getMessage());
		} catch (AccountInactiveException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
