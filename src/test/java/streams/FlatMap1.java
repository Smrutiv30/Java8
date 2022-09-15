package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap1 {

	public static void main(String[] args) {
		
		List<String> team1=Arrays.asList("scott","david","john");
		List<String> team2=Arrays.asList("Mary","Luna","tom");
		List<String> team3=Arrays.asList("ken","jenny","kitty");
		
		//add all collection into 1 big collection
		List<List<String>> playername=new ArrayList<List<String>>();
		playername.add(team1);
		playername.add(team2);
		playername.add(team3);
		
		// without using stream
		/*for(List<String> str:playername) {
			{
				for(String name:str) {
					System.out.println(name);
				}
			}*/
			
			// using flatmap
		
		//playername.stream().flatMap(plist->plist.stream()).forEach(System.out::println);
		
		List<String> names=playername.stream().flatMap(plist->plist.stream()).collect(Collectors.toList());
		System.out.println(names);
		}

	}


