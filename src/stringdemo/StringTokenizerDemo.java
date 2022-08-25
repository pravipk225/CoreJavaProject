package stringdemo;
import java.util.StringTokenizer;
public class StringTokenizerDemo {
	public static void main(String[] args) {
		String data="WB-KOL?ORISSA-BBSR?BIHAR-PATNA";
		StringTokenizer tokenizer=new StringTokenizer(data,"?-");
		System.out.println("Total Token: "+tokenizer.countTokens());
		while(tokenizer.hasMoreTokens()){
			String val=tokenizer.nextToken();
			System.out.println(val);
		}
		System.out.println("Total Token: "+tokenizer.countTokens());
		
	}

}
