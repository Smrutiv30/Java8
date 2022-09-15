 package function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;


class Employee{
	 String ename;
	 int salary;
	 
	 // create constructor
	 Employee(String ename, int sal){
		 this.ename=ename;
		 this.salary=sal;
	 }
 }

public class Demo2 {

	public static void main(String[] args) {
		
		// calculate bonus of all employee and return value
		
		ArrayList<Employee> emplist= new ArrayList<Employee>();
		
		emplist.add(new Employee("David",50000));
		emplist.add(new Employee("jenny",30000));
		emplist.add(new Employee("sam",20000));
		
		
		Function<Employee,Integer> fn=e->{
			int sal=e.salary;
			
			if(sal>=10000 && sal<=20000)
				return(sal *10/100);
			else if(sal>20000 && sal<=30000)
				return(sal*20/100);
			else if(sal>30000 && sal<=50000)
				return(sal *30/100);
			else
				return(sal*40/100);
				};
				
	     Predicate<Integer>p =b->b>=5000;
			
	     for(Employee emp:emplist) {
	    	 int bonus =fn.apply(emp);  // function
	    	 
	    	if(p.test(bonus));    // using predicate
	    	{
	    	 System.out.println(emp.ename+"  "+emp.salary);
	    	 System.out.println("Bonus is:"+bonus);
	    	 
	    	 // if bonus value is greater than 5000 
	    	 //than only print the employee details
	    	 
	     }
		}
	
	}
}

