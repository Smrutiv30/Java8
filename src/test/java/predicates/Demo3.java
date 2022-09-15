package predicates;

import java.util.function.Predicate;

// join predicate - and, or , negate
// it will return true or false
public class Demo3 {

	public static void main(String[] args) {
		int a[]= {5,15,20,25,30,35,40,45,50,55,60,65};
		
		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=i->i>50;
		
		// using and-> Even num and greater than 50
		for(int n:a) {
			
		//	if(p1.test(n) && p2.test(n));
			// join 2 predicate
			//and
			if(p1.and(p2).test(n)) {
			System.out.println(n);
			
			}
		}
		//or
		for(int n:a) {
			
				// join 2 predicate
				if(p1.or(p2).test(n)) {
				System.out.println(n);
		}
}
		
		//negate
		for(int n:a) {
			
			//	if(p1.test(n) && p2.test(n));
				// join 2 predicate
				if(p1.negate().test(n)) {
				System.out.println(n);
	}
}
	}
}
