package wrapper;
public class IntegerDemo {
	public static void main(String[] args) {
		int val=1500;
		Integer intObj=new Integer(val); //Auto Boxing
		int x=intObj.intValue(); //UnBoxing Integer to int
		byte b=intObj.byteValue();     //Integer to byte
		double d=intObj.doubleValue(); //Integer to double
		String str="15000";
		int sal=Integer.parseInt(str); // String to int
		sal=Integer.valueOf(str);// String to int
		Integer m=new Integer(127);
		Integer n=new Integer(130);
		System.out.println("m==n: "+(m==n));
		System.out.println("m.equals(n): "+(m.equals(n)));
		int flag=m.compareTo(n);
		System.out.println(flag);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		Integer salary=new Integer(150000);
		System.out.println("Salary: "+salary);
		System.out.println("Pf Amount: "+pfAmount(salary));
	}
	
	public static Double pfAmount(Integer salary){
		double pfRate=10.5;
		Double pfAmount=(salary/100)*pfRate;
		return pfAmount;
	}

}









