package collectiondemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> set=new TreeSet<Integer>();
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

}
