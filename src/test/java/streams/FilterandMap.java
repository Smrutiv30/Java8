package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//using filter and map
// create class

//fetch the data for all employee using filter than print  whose  salary >40000 

class employee{
	int empid;
	String ename;
	int salary;
	
	// create constructor
	employee(int empid,String ename,int salary)
	{
		this.empid=empid;
		this.ename=ename;
		this.salary=salary;
	}
}

public class FilterandMap {

	public static void main(String[] args) {
		
		// create object of employee class
		
		List<employee> emplist=Arrays.asList(
				new employee(101,"john",30000),
				new employee(102,"scott",50000),
				new employee(103,"charles",60000),
				new employee(104,"Alex",40000),
				new employee(105,"anne",70000));
		
		// using filter and map
		List<Integer> empsallist=emplist.stream()
		.filter(e->e.salary>40000 && e.empid>102)
		.map(e->e.salary ).collect(Collectors.toList());
		System.out.println(empsallist);
		

	}

}
