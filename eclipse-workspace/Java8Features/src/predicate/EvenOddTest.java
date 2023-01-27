package predicate;

import java.util.function.Predicate;

public class EvenOddTest {

	public static void main(String[] args) {
		Predicate<Integer> p = n->n%2==0;
		boolean isEven = p.test(21);
		System.out.println(isEven);
	}
}
