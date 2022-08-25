package overloading;

public class Calculator {
	void add(int x,int y){
		int result=x+y;
		System.out.println(x+" + "+y+" = "+result);
	}
	double add(int x,int y,double z){
		double result=x+y+z;
		return result;
	}

}
