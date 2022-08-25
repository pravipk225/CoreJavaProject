package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(1000);
		list.add(10);
		list.add(100);
		list.add(2000);
		list.add(2,600);
		System.out.println("List: "+list);
		List<Integer> newList=getNewList(list);
		System.out.println("New List: "+newList);
		list.remove(2);
		System.out.println("list.remove(2): "+list);
		newList.retainAll(list);
		System.out.println("newList.retainAll(list): "+newList);
		newList.removeAll(list);
		System.out.println("newList.removeAll(list): "+newList);
		
	}
	
	public static List<Integer> getNewList(List<Integer> list){
		List<Integer> newList=new ArrayList<Integer>();
		newList.add(5000);
		newList.add(6000);
		newList.addAll(list);
		return newList;
	}

}












