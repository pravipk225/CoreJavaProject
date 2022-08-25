package test;

public class Loops {
	Loops() {
		
	}

	public static void main(String[] args) {
		// running till the condition matches
//		int a=100;
//		do {
//		System.out.println(a);	
//		a--;
//		}while(a>10);
Loops l = new Loops();
		int k = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= 10 - i; j++) {
				System.out.println("i-------------" + i + "--------" + j);
//				System.out.print(k);
//				System.out.print("\t");
//				k++;
			}
			System.out.println("");
		}

	}
}
