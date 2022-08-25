package stringdemo;

public class StringDemo1 {
	public static void main(String[] args) {
		String s1="Cognizant,Technology,Solutions";
		System.out.println("charAt(2): "+s1.charAt(2));
		System.out.println("codePointAt(2): "+s1.codePointAt(2));
		char chArr[]=s1.toCharArray();
		s1=s1.toLowerCase();
		s1=s1.toUpperCase();
		String val=s1.substring(3);
		System.out.println(s1);
		System.out.println(val);
		String val1=s1.substring(3,5);
		System.out.println(val1);
		s1=s1.replace("C", "T");
		System.out.println(s1);
		String tokens[]=s1.split(",");
		System.out.println("------------");
		for(String s:tokens){
			System.out.println(s);
		}
		
	}

}






