package test;

import java.util.Scanner;

class Encrypter {
	static String getEncryptedName(String Name) {
		Validator v = new Validator();
		boolean bln = v.validate(Name);
		if(bln)
		{
			StringBuilder sb = new StringBuilder();
	        sb.append(Name);
	        sb.reverse();
	        Name = sb.toString();
	        Name = Name.toLowerCase();
		}
		else {
			throw new IllegalArgumentException("Try again with valid name");
		}
		return Name;

	}
}

class Validator {
	public boolean validate(String name) {
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (ch != ' ' && !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
				return false;
			}
		}

		return true;
	}
}

public class Solution {
	private static final Scanner INPUT_READER = new Scanner(System.in);

	public static void main(String[] args) {
		String name = INPUT_READER.nextLine();

		try {
			System.out.println(Encrypter.getEncryptedName(name));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}