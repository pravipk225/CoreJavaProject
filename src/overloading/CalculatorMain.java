package overloading;

public class CalculatorMain {
	public static void main(String[] args) {
		int x=100;
		int y=200;
		double z=15.45;
		Calculator calculator=new Calculator();
		calculator.add(x,y);
		double result=calculator.add(152, 124, 15.65);
		System.out.println(x+" + "+y+" + "+z+" = "+result);
	}

}
