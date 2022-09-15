package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		
		//  using map
		List<Integer> list=Arrays.asList(1,3,8,9,10,12);
		
		List<Integer> list1=list.stream().map(n->n+3).collect(Collectors.toList());
		System.out.println(list1);
		
		// if you have complex data than go for flatmap
		List<Integer>list2=Arrays.asList(1,2);
		List<Integer>list3=Arrays.asList(3,4);
		List<Integer>list4=Arrays.asList(5,6);
		List<Integer>list5=Arrays.asList(7,8);
		
		// add multiple list in single list
		List<List<Integer>> finallist=Arrays.asList(list2,list3,list4,list5);
		
		//using flatmap
		List<Integer> finalresult=finallist.stream().flatMap(l->l.stream().map(n->n+10)).collect(Collectors.toList());
		System.out.println(finalresult);
		

	}

}
