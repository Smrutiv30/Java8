package lambdademo;
//create functional interface and if only one abstract method than we can use lambdaexpression
//bcz of functional interface don't need to write separate class we can use lambda expression

interface Cab{
	public String bookcab(String source, String destination);
}
//implement the interface create another class
//normal way to implement abstract method using separate class
/*class Uber implements Cab{
	public String bookcab(String source, String destination) {
		System.out.println("uber cab is booked from "+ source + " To " + destination);
		return ("price: $1000");
	}
	
	
}*/
public class Test {

	public static void main(String[] args) {
		// use lambda expression to write implementation
	   // invoke class object of uber
		Cab cab=(String source, String destination) ->{
			System.out.println("uber cab is booked from "+ source + " To " + destination);
			return ("price: $1000");
			
		};
		System.out.println(cab.bookcab("Toronto", "New york"));
		
	}

}
