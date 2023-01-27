package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ParseException {
		Machine m[]=  new Machine[50];
		m = setMachine(m);
		//printMachine(m);
		long totalTime = getTime(m);
		System.out.println(totalTime);
	}
	public static long getTime(Machine m[]) throws ParseException {
		String totalTimeNotWorked = "";
		long totalT = 0;
		long totaltimeinSec=0;
		long totaltimeinMin=0;
		long totaltimeinHr=0;
		long a=0;
		
		for(int i=0;i<m.length;i++) {
			List<TimeContainer> list = m[i].getList();
			Iterator<TimeContainer> itr = list.iterator();
			//System.out.println("i===");
			
			while(itr.hasNext()) {
				TimeContainer  t = itr.next();
				String st = t.getStartTime();
				String et = t.getStopTime();
				SimpleDateFormat date = new SimpleDateFormat("HH:mm:ss");
				Date d1 = date.parse(st); 
				Date d2 = date.parse(et); 
				long time_in_ms = Math.abs(d2.getTime() - d1.getTime());
				totalT+=time_in_ms;
				//System.out.println(st+":"+strtT+"::"+(st-strtT));
				//totalTimeNotWorked += (st - strtT);
				totaltimeinHr = (totalT/(60*60*1000))%24;
				totaltimeinMin = (totalT/(60*1000))%60;
				totaltimeinSec = (totalT/(1000))%60;
				//totalTimeNotWorked += totaltimeinHr+""
			}
			a+=(totalT/(60*60*1000))%24;
			totalT=0;
			//System.out.println("--"+a);
			
		}
		return a;
	}

	public static void printMachine(Machine m[]) {
		for(int i=0;i<m.length;i++) {
			List<TimeContainer> list = m[i].getList();
			Iterator<TimeContainer> itr = list.iterator();
			System.out.println("i====="+i);
			
			while(itr.hasNext()) {
				TimeContainer t = itr.next();
				System.out.println(t.getStartTime()+"::End::"+t.getStopTime());
				
			}
			//System.out.println(list.toArray());
		}
	}
	private static Machine[] setMachine(Machine[] m) {
		// TODO Auto-generated method stub
		for(int i=0;i<m.length;i++) {
			m[i] = new Machine();
			//List<TimeContainer> l = new ArrayList<TimeContainer>();
			TimeContainer t =  new TimeContainer();
			t.setStartTime("10:00:00");
			t.setStopTime("20:00:00");
			
			//if(m[i].getList()==null) {
				m[i].setList(new ArrayList<TimeContainer>()); 
				m[i].getList().add(t);
			//}
			
			t =  new TimeContainer();
			t.setStartTime("10:00:00");
			t.setStopTime("12:00:00");
			m[i].getList().add(t);
			
			//System.out.println("--"+m[i].getList().get(0).getStartTime()+":"+m[i].getList().get(0).getStopTime());
			
			t =  new TimeContainer();
			t.setStartTime("10:00:00");
			t.setStopTime("14:10:00");
			m[i].getList().add(t);
			
			//System.out.println("--"+m[i].getList().get(0).getStartTime()+":"+m[i].getList().get(0).getStopTime());
			
			
		}
		return m;
	}
}
