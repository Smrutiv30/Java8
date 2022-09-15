package predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String ename;
	int salary;
    int experience;
    
    Employee(String name, int sal, int exp){
    	ename=name;
    	salary=sal;
    	experience=exp;
    }
}

public class Demo2 {

	public static void main(String[] args) {
	//use lambda expression for object
		
		Employee emp=new Employee("scott",50000,5);
		
		//emp obj -> return name if sal>35k exp>3
		
		Predicate<Employee> pr=e->(e.salary>35000 && e.experience>3);
		//System.out.println(pr.test(emp));
		
		//Ex 2: name of the employee and salary if the condition is true
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("john",50000,5));
		al.add(new Employee("jenny",30000,3));
		al.add(new Employee("sam",35000,2));
		al.add(new Employee("scott",70000,6));
		
		for(Employee em:al) {
			if(pr.test(em)) {
				System.out.println(em.ename+"  "+em.salary);
			}
		}
		
		}

}
