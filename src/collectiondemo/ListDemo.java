package collectiondemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListDemo {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Alok");
		list.add(50);
		list.add(152.12);
		list.add(true);
		list.add(new Employee());
		list.add(15.12f);
		System.out.println(list);
		double result=0.0;
		System.out.println("--------Normal Loop-------------");
		//Normal Loop
		for (int i = 0; i < list.size(); i++) {
			Object obj=list.get(i);
			System.out.println(obj.getClass().getName()+" : "+obj);
			if(obj instanceof Number){
				Number num=(Number) obj;
				result+=num.doubleValue();
			}
		}
		System.out.println("Result Is: "+result);
		System.out.println("--------For Each loop-------------");
		for (Object obj: list) {
			System.out.println(obj.getClass().getName()+" : "+obj);
		}
		System.out.println("--------Iterator-------------");
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			Object obj=itr.next();
			System.out.println(obj.getClass().getName()+" : "+obj);
		}
		
	}

}










