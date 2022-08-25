package collectiondemo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		set.add(100);
		set.add(10);
		set.add(200);
		set.add(200);
		set.add(100);
		set.add(200);
		System.out.println("Size: "+set.size());
		System.out.println("----For Each Loop----");
		for (Integer val : set) {
			System.out.println(val);
		}
		System.out.println("------Iterator-----");
		Iterator<Integer> itr= set.iterator();
		while(itr.hasNext()){
			Integer val=itr.next();
			System.out.println(val);
		}
		
	}
	public static Set<Integer> getSetToList(List<Integer> list){
		return new HashSet<Integer>(list);
	}
	public static List<Integer> getListToSet(Set<Integer> set){
		return new ArrayList<Integer>(set);
	}

}






