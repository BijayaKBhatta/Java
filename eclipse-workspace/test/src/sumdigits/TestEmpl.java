package sumdigits;

import java.util.HashMap;
import java.util.Map;

public class TestEmpl {
	public static void main(String[] args) {
		Map<Employee,String> hMap = new HashMap<Employee,String>();
	      Employee e1 = new Employee ("abc", 12, 20000);
	      Employee e2 = new Employee ("abc", 12, 20000);
	      Employee e3 = new Employee ("xyz", 14, 40000);
	      hMap.put(e1,"ABC");
	      hMap.put(e2,"PQR");
	      hMap.put(e3,"XYZ");

	      String s = "10";
	      String s1 ="10";
	      System.out.println("String=== "+s.equals(s1));
	      System.out.println("String== "+s==s1);
	      
	      
	      System.out.println("hashcode of e1 & e2="+e1.hashCode()+"::"+e2.hashCode());
	      System.out.println("Size : " + hMap.size());//

	      System.out.println("== : " + (e1==e2));

	      System.out.println(".equals : " + e1.equals(e2));
	      hMap.entrySet().stream().forEach(p->System.out.println(p.getKey().getEmpId()));


	}

}
