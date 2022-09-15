package consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;



//create multiple of object and based on the salary and then calculate th bonus
		// bonus is >5000 than print the details of the employee
		
		// first calculate bonus than check condition

class Employee{
	 String ename;
	 int salary;
	 String gender;
	 
	 // create constructor
	 Employee(String ename, int salary, String gender){
		 this.ename=ename;
		 this.salary=salary;
		 this.gender=gender;
	 }
}
public class Demo2 {

	public static void main(String[] args) {
		
	ArrayList<Employee> emplist=new ArrayList<Employee>();
	emplist.add(new Employee("David",50000,"Male"));
	emplist.add(new Employee("jenny",60000,"Female"));
	emplist.add(new Employee("sam",20000,"Male"));
	
	//Function -> task-1
	Function<Employee,Integer> f=emp->(emp.salary*10/100); 
	
	//Predicate ->task-2
	Predicate<Integer>p=b->b>=5000;
	
	//consumer ->task-3
	Consumer<Employee> c= emp->{
		                       System.out.println(emp.ename);
		                       System.out.println(emp.salary);
		                       System.out.println(emp.gender);
		                       };
		       for(Employee e:emplist)
		       {
		    	 int bonus=  f.apply(e);
		    	 
		    	 if(p.test(bonus)) {
		    		 
		    		c.accept(e);
		    		System.out.println("Employee bonus:"+bonus);
		    	 }
	}
	}

}
