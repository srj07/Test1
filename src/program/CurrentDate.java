package program;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Date d = new Date();
		 //System.out.println(d.toString());
		 
		 SimpleDateFormat sd = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		 System.out.println(sd.format(d));
		 //System.out.println(d.toString());
		 
	}

}
