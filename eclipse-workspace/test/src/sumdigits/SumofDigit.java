package sumdigits;

import java.util.ArrayList;
import java.util.List;

public class SumofDigit {
	public static void main(String[] args) {
		int number = 999994;
		int sum = 0 ;
		int result =999994;
		List<Integer> list = new ArrayList<>();
		do {
			number = result;
			result = addDigits(number);
			list.add(result);
		}
		while(result>9); // digits 
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	/*EMP    EMP_SAL
	id     id, city, sal
	
	select max(empsal.sal),empsal.city from EMP e, EMP_SAL empsal where 
	e.id = empsal.id and group by city;
	*/
	public static int addDigits(int number) {
		
		int sum=0;
		while(number>0) {
			int reminder = number%10;
			sum+=reminder;
			number/=10;
		}
		return sum;
	}

}

//999994
//49
//13
//4



//2351

//11 
//2
//test case -2
//36
//9(3+6)



