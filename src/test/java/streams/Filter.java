package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
	public static void main(String[] args) {
		
		// create Arraylist collections
		
		List<Integer> numberlist= Arrays.asList(10,15,20,25,30,40,45);
		 // filter the data based on condition- only even number
		
		List<Integer>evennumlist=new ArrayList<Integer>();
		
		//without using filter
		/* 
		 * for(int n:numberlist) { if(n%2==0) evennumlist.add(n); }
		 * System.out.println(evennumlist);
		 */
 
		// using stream
		evennumlist=numberlist.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		// it will print directly the  data
		//numberlist.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		System.out.println(evennumlist);
}
}
