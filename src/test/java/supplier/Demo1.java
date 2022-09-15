package supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Demo1 {

	public static void main(String[] args) {
		// supplier interface doesn't take any argument argument but it return some value
		
		Supplier s=()->new Date();
		
		System.out.println(s.get());

	}

}
