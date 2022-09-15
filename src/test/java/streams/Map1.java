package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map1 {

	public static void main(String[] args) {
		
		List<String> cars= Arrays.asList("bmw","audi","jetta","range rover");
		List<String> carslist= new ArrayList<String>();
		
		//without using stream
		/*for(String str:cars) {
			System.out.println(str.length());}*/
		
		
		//using stream
	   cars.stream().map(str->str.length()).forEach(System.out::println);
	   // cars.stream().map(str->str.length()).forEach(len->System.out.println(len));

	}

}
