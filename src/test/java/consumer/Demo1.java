package consumer;

import java.util.function.Consumer;

public class Demo1 {

	
	public static void main(String[] args) {
		// take one argument but doesn't return any value
		Consumer<String> c=s->System.out.println(s);
		
		c.accept("Welcome");

	}

}
