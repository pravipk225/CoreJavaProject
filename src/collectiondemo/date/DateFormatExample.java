package collectiondemo.date;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatExample {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println("Default Format: "+date);
		DateFormat ukDateFormatStyleFULL=DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
		DateFormat usDateFormatStyleFULL=DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		
		String usDateStyleLong=usDateFormatStyleFULL.format(date);
		String ukDateStyleLong=ukDateFormatStyleFULL.format(date);
		System.out.println("usDateStyleLong: "+usDateStyleLong);
		System.out.println("ukDateStyleLong: "+ukDateStyleLong);
		//--------------------------------------------------------
		DateFormat ukDateFormatStyleSHORT=DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK);
		DateFormat usDateFormatStyleSHORT=DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
		
		String usDateStyleShort=usDateFormatStyleSHORT.format(date);
		String ukDateStyleShort=ukDateFormatStyleSHORT.format(date);
		System.out.println("usDateStyleShort: "+usDateStyleShort);
		System.out.println("ukDateStyleShort: "+ukDateStyleShort);

		
	}

}








