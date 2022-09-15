package predicates;

import java.util.function.Predicate;

public class Demo1 {

	public static void main(String[] args) {
		//Ex1
		Predicate<Integer> p= i->(i>10);
		
		System.out.println(p.test(20)); // it will return true
		System.out.println(p.test(5));
		
		
		// Ex 2: check the length of the given string
		Predicate<String> pr=s->(s.length()>4);
		System.out.println(pr.test("Welcome"));
		System.out.println(pr.test("abc"));
		
		
		//Ex 3: print array elements whose size is >4 from array
		// define string
		String names[]= {"sam","Smith","jenny","jamison"};		
		
		// check the condition
		for( String name:names) {
			/*if(pr.test(name)) {
				System.out.println(name);*/
		// Now using lambda expression and you can write multiple condition
			if(name.length()>4) {
				System.out.println(name);
		
		
		
			}
		}

	}

}
