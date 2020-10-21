package codeSolving;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class GetCurrentDateTime {

	public static void main(String[] args) {

		long time = System.currentTimeMillis();
		System.out.format("\nCurrent Date time: %tc%n\n", time);
		
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

		System.out.println("\nNow: " + cdt.format(System.currentTimeMillis()));

	}

}
