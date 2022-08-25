package collectiondemo.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class DateDiffDemo {
	public static void main(String[] args) {
		Map<String, String> voterMap=new HashMap<String, String>();
		voterMap.put("Ram", "12-5-2015");
		voterMap.put("Sam", "05-12-2000");
		voterMap.put("Hari", "06-11-1900");
		voterMap.put("Sita", "08-12-1997");
		voterMap.put("Ramesh", "03-03-1999");
		for (Map.Entry<String, String> entry:voterMap.entrySet()) {
			String name=entry.getKey();
			String dob=entry.getValue();
			System.out.println(name+" : "+dob);
		}
		List<String> voterNameList=getVoterList(voterMap);
		System.out.println(voterNameList);
	}
	public static List<String> getVoterList(Map<String, String> voterMap){
		List<String> voterList=new ArrayList<String>();
		Date currentDate=new Date();
		final String pattern="dd-MM-yyyy";
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		for (Map.Entry<String, String> entry:voterMap.entrySet()) {
			String name=entry.getKey();
			String dob=entry.getValue();
			try {
				Date dobDate=sdf.parse(dob);
				long mills=currentDate.getTime()-dobDate.getTime();
				long secs=mills/1000;
				long mints=secs/60;
				long hours=mints/60;
				long days=hours/24;
				if(days>=(18*365)){
					voterList.add(name);
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return voterList;
	}

}








