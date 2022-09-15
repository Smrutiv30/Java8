package function;

import java.util.function.Function;

//function chaining using method andthen() and compose()

public class Demo3 {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f1=n->n*2;
		
		Function<Integer,Integer> f2=n->n*n*n;
		
		System.out.println(f1.andThen(f2).apply(2));
		
		// it will execute in reverse order first f then f1
		System.out.println(f1.compose(f2).apply(2));
		 

	}

}
