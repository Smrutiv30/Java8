package streams;
//condi= length of the string should be >6 and<8

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter1 {

	public static void main(String[] args) {
		
		// if you have multiple condition
		
		List<String> names=Arrays.asList("james","Manny","Joffery","Johnson");
		
		List<String> namestring=new ArrayList<String>();
		
		namestring=names.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
		System.out.println(namestring);
		
		
		//names.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);		


	}

}
