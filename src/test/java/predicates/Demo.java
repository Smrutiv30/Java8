package predicates;

//if you have conditional  check than only go for predicate interface
//predicate ...> one parameter and returns boolean value

import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
	   //Ex: 1
		// p is reference variable and i is argument and it will return boolean value
		Predicate<Integer> p=i->(i>10);
		
	    // call method
	System.out.println(p.test(20)); // true
	
	
	//Ex:2 :check the length of given string is greater than 4 or not.
	// take string as parameter
	Predicate<String> pr=s->(s.length()>4);
	//invoke the lambda expression
	System.out.println(pr.test("Welcome")); //true
	
	//Ex:3 print array elements and size is >4 from array
	//multiple value
	String names[]= {"sam", "david","Smith","Merry"};
	
	for(String name:names) {
		
		// check name >4 or not if >4 than print name
		
	     if(pr.test(name)) { 
	    	 System.out.println(name); }
		 
		// we can also write direct using length method
		/*if(name.length()>4) {
			System.out.println(name);
		}*/
	}
	}

}
