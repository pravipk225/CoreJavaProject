package stringdemo;

public class StringDemo {
	public static void main(String[] args) {
		char chArr[]={'C','O','G','N','I','O'};
		byte bytes[]={'C','t','S'};
		String s1=new String(chArr);
		String s2=new String(bytes);
		int x=10100;
		String s3=String.valueOf(x);
		String s4=s1;
		Double d=new Double(15000.154);
		String s5=d.toString();
		String s6=new String(chArr,1,2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		
		
		
	}

}
