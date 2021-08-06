package program;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar ca = Calendar.getInstance();
		
		 SimpleDateFormat sd = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		 System.out.println(sd.format(ca.getTime()));
		 System.out.println(ca.get(Calendar.YEAR));
		 System.out.println(ca.get(Calendar.DATE));
		 System.out.println(ca.get(Calendar.HOUR_OF_DAY));

	}

}
