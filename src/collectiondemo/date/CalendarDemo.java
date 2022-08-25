package collectiondemo.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println("Default Date         : "+date);
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.MONTH, 10);
		calendar.add(Calendar.HOUR, 2);
		calendar.add(Calendar.MINUTE, 20);
		calendar.add(Calendar.SECOND, 30);
		date=calendar.getTime();
		System.out.println("After 10 months 2:20:30 Date is: "+date);
		System.out.println("---------------------------");
		checkFlightTime();
	}
	
	public static void checkFlightTime(){
		String flightTime="12-05-2017 02:20:30";
		String pattern="dd-MM-yyyy hh:mm:ss";
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		try {
			Date date=sdf.parse(flightTime);
			Calendar calendar=Calendar.getInstance();
			calendar.setTime(date); //Set New Time in Calendar
			calendar.add(Calendar.HOUR, 2);
			calendar.add(Calendar.MINUTE, 30);
			date=calendar.getTime();
			String newFlightTime=sdf.format(date);
			System.out.println("Old Flight Time                  : "+flightTime);
			System.out.println("After 2hr:30mints New Flight Time: "+newFlightTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}







