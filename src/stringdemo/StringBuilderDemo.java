package stringdemo;

public class StringBuilderDemo {
	public static void main(String[] args) {
		String str="EARTH";
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		System.out.println("before reverse: "+sb);
		sb.reverse();
		System.out.println("after reverse: "+sb);
		sb.reverse();
		sb.insert(2, "-To-");
		System.out.println("insert(2, -To-): "+sb);
		sb.delete(2, 6);
		System.out.println("sb.delete(2, 6): "+sb);
		String s=sb.toString();
		System.out.println(s);
	}

}
