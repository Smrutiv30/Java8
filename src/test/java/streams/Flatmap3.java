package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	String name;
	int sid;
	char grade;
	
	Student(String name,int sid,char grade){
		this.name=name;
		this.grade=grade;
		this.sid=sid;
	}
}

public class Flatmap3 {

	public static void main(String[] args) {
		
		List<Student> studentList1=new ArrayList<Student>();
		studentList1.add(new Student("Smith",101,'A'));
		studentList1.add(new Student("John",102,'B'));
		studentList1.add(new Student("Kenedy",103,'C'));
		
		List<Student> studentList2=new ArrayList<Student>();
		studentList1.add(new Student("Scott",104,'A'));
		studentList1.add(new Student("Mary",105,'B'));
		studentList1.add(new Student("Kitty",106,'C'));
		
		List<List<Student>>studentList=Arrays.asList(studentList1,studentList2);
		
		//without java8
		
		/*
		 * for(List<Student> str:studentList) {
		 * 
		 * for(Student stu:str) { System.out.println(stu.name);
		 * System.out.println(stu.grade); } }
		 */
      
		//using stream
		List<String> slist=studentList.stream()
		.flatMap(stulist->stulist.stream()).map(m->m.name).collect(Collectors.toList());
		System.out.println(slist);
	}

}
