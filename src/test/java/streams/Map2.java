package streams;

import java.util.ArrayList;

//reqn= read every collection and multiply by 3 and store in other collection

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map2 {

	public static void main(String[] args) {
		
		List<Integer> numlist=Arrays.asList(2,3,4,5,10,30,50,60);
		List<Integer> multiplylist= new ArrayList<Integer>();
		
		//using stream
		/*
		 * for(int n:numlist) { //n=n*3; //multiplylist.add(n); System.out.println(n*3);
		 * }
		 */
		
		//multiplylist=numlist.stream().map(n->n*3).collect(Collectors.toList());
		//System.out.println(multiplylist);
		
		numlist.stream().map(n->n*3).forEach(num->System.out.println(num));
    
	}

}
