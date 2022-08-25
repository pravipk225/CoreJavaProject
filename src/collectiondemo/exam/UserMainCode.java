package collectiondemo.exam;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserMainCode {
	
	public static int[] getUniqueArray(int[] input1){
		//Write Code
		Set<Integer> set=new LinkedHashSet<Integer>();
		for (int i : input1) {
			set.add(i);
		}
		int output1[]=new int[set.size()];
		int index=0;
		for(int i:set){
			output1[index]=i;
			index++;
		}
		return output1;
	}

}








