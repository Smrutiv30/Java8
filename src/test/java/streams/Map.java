package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// req= convert into upper case and store in other collection

public class Map {

	public static void main(String[] args) {
		
		List<String> cars= Arrays.asList("bmw","audi","jetta","range rover");
		List<String> carslist= new ArrayList<String>();
		
		// without using stream
		/*
		 * for(String str:cars) { carslist.add(str.toUpperCase());
		 * 
		 * }
		 */
		
		//carslist=cars.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
       // System.out.println(carslist);
        
		// map will take consumer as parameter
        cars.stream().map(str->str.toUpperCase()).forEach(System.out::println);
        
        
}
}
