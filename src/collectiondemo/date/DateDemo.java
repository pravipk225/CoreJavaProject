package collectiondemo.date;
import java.util.Date;
public class DateDemo {
	public static void main(String[] args) {
		Date currentDate=new Date();
		System.out.println("Current Date: "+currentDate);
		int year=currentDate.getYear();
		int month=currentDate.getMonth();
		int day=currentDate.getDate();
		System.out.println("Year : "+(year+1900));
		System.out.println("Month: "+(month+1));
		System.out.println("Day  : "+day);
		Date olddate=new Date(117,1,20,2,30,15);
		System.out.println(olddate);
	}

}









