package streams;

// condi= print words except null

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter2 {

	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("coffee", "cup",null,"tea","cake",null);
		
		//List<String> wordsresult=words.stream().filter(n->n!=null).collect(Collectors.toList());
		//System.out.println(wordsresult);
		
		words.stream().filter(n->n!=null).forEach(System.out::println);

	}

}
