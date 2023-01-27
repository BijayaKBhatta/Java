package practice;

public class DigitSumisNumber {
	public static void main(String[] args) {
		int number = 20;
		int digit = 3;
		int findNumber = getNumber(number,digit);
		System.out.println(findNumber);
	}
	// seems like it will not work
	private static int getNumberBS(int number, int digit) {
		int max_number=9, min_number=1;
		for(int i=0;i<digit-1;i++) {
			max_number = max_number*10+9;
			min_number = min_number*10;
		}
		int low=min_number, mid=0, high=max_number;
		while(low<=high) {
			mid=(low+high)/2;
			int j = mid;
			int sum=0;
			while(j>0) {
				sum += j%10;
				j=j/10;
			}
			if(sum==number) {
				System.out.println("--"+mid);
				low = mid+1;
			}
			
		}
		return -1;
	}
	
	private static int getNumber(int number, int digit) {
		// TODO Auto-generated method stub
		int max_number=9, min_number=1;
		for(int i=0;i<digit-1;i++) {
			max_number = max_number*10+9;
			min_number = min_number*10;
		}
		for(int i=max_number;i>min_number;i--) {
			int j = i;
			int sum=0;
			while(j>0) {
				sum += j%10;
				j=j/10;
			}
			if(sum==number) {
				System.out.println("--"+i);
				break;
			}
		}
		System.out.println(max_number+":"+min_number);
		return 0;
	}

}
