package collectiondemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> empMap=new HashMap<Integer, String>();
		empMap.put(101010, "Smith");
		empMap.put(101011, "Arindam");
		empMap.put(101012, "Sonia");
		empMap.put(101010, "Ajay");
		empMap.put(101014, "Sonia");
		System.out.println("Size: "+empMap.size());
		System.out.println("empMap: "+empMap);
		Set<Integer> keys=empMap.keySet();
		Collection<String> values=empMap.values();
		System.out.println("Keys: "+keys);
		System.out.println("Values: "+values);
		System.out.println("101012 Name is: "+empMap.get(101012));
		System.out.println("-------Using keySet() get value from map.-------");
		for (Integer id:empMap.keySet()) {
			String name=empMap.get(id);
			System.out.println(id+" : "+name);
		}
		System.out.println("-------Using Map.Entry get value from map.-------");
		for(Map.Entry<Integer,String> entry:empMap.entrySet()){
			Integer id=entry.getKey();
			String name=entry.getValue();
			System.out.println(id+" : "+name);
		}
		empMap.remove(101010);
		System.out.println("empMap: "+empMap);
	}

}








