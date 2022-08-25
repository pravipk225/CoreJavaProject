package collectiondemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class CollectionsDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1000);
		list.add(10);
		list.add(100);
		list.add(2000);
		list.add(600);
		list.add(10);
		list.add(100);
		System.out.println("Before Sort: "+list);
		Collections.sort(list);// ASC Sorting
		System.out.println("After Asc Sort: "+list);
		Comparator<Integer> comparator=Collections.reverseOrder();
		Collections.sort(list,comparator);
		System.out.println("After DESC Sort: "+list);
		System.out.println("Max in List: "+Collections.max(list));
		System.out.println("Min in List: "+Collections.min(list));
		Set<Integer> set=new LinkedHashSet<Integer>(list);
		for(int val:set){
			int frq=Collections.frequency(list, val);
			System.out.println(val+" : "+frq);
		}
		int index=Collections.binarySearch(list, 100);
		System.out.println("Collections.binarySearch(list, 100): "+index);
		Collections.replaceAll(list, 100, 1);
		System.out.println("Collections.replaceAll(list, 100, 1): "+list);
		
	}

}










