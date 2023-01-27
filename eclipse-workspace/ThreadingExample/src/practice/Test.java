package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {
	public static void main(String[] args) throws ParseException {
		String st = "11:31:23";
		String et = "10:30:22";
		SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
		Date d = s.parse(st);
		Date d2 = s.parse(et);
	//	System.out.println(d.getHours());
		System.out.println(d.getTime() - d2.getTime());
		long timeinMS = Math.abs(d.getTime() - d2.getTime());
		//System.out.println(timeinMS);
		long a = timeinMS/((1000 * 60 * 60));
		long b = timeinMS/((1000 * 60));
		long c = timeinMS/((1000));
		System.out.println("hr:"+a+" :min:"+b+" :sec:"+c);
		
		long aa = TimeUnit.MILLISECONDS.toSeconds(timeinMS);
		long bb = TimeUnit.MILLISECONDS.toMinutes(timeinMS); 
		long cc = TimeUnit.MILLISECONDS.toHours(timeinMS); 
		System.out.println("hr:"+cc+" :min:"+bb+" :sec:"+aa);
		
		// in hr 
		//System.out.println(hhhh);
	}

}
