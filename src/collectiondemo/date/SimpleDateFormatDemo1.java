package collectiondemo.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class SimpleDateFormatDemo1 {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String dobPattern="dd-MM-yyyy";
		System.out.println("Enter Dob(dd-MM-yyyy): ");
		String birthDate=scanner.nextLine();
		System.out.println("Birth Date: "+birthDate);
		SimpleDateFormat sdf=new SimpleDateFormat(dobPattern);
		sdf.setLenient(false);
		try {
			Date dobDate=sdf.parse(birthDate);
			String dayPattern="EEEE";
			sdf=new SimpleDateFormat(dayPattern);
			String dobDay=sdf.format(dobDate);
			System.out.println("Birth Day : "+dobDay);
		} catch (ParseException e) {
			System.err.println("Date format must be dd-MM-yyyy");
		}
		
	}

}
