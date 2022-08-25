package collectiondemo.exam;

public class Main {
	public static void main(String[] args) {
		int input1[]={100,200,300,100,30,200};
		for(int val:input1){
			System.out.print(val+" ");
		}
		System.out.println();
		int output1[]=UserMainCode.getUniqueArray(input1);
		for(int val:output1){
			System.out.print(val+" ");
		}
		
	}

}
