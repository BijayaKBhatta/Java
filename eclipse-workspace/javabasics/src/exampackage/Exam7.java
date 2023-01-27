package exampackage;


public class Exam7 {
	public static void main(String[] args) {
		
		String[] years = new String[] {"senior", "freshman","junior"};
  
		boolean[] probation = new boolean[] {true, false,false};
		double[] gpas = new double[] {3.4,2.8,3.7};
		double avg = 0.0;
		int count=0;
		for(int i=0;i<years.length;i++) {
			if(probation[i]==true && years[i].equals("senior")) {
				avg +=gpas[i];
				count++;
			}
		}
		avg = avg/count;
		System.out.println("Avarage gpas of all the senior students who are in probation is: "+avg);
		
	}
	
	
}
