package functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Student{
	int id;
	String name;
	long marks;
	public Student(int id, String name, long marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}

public class Predicate4 {
public static void main(String[] args) {
	List<Student> l1=new ArrayList<Student>(Arrays.asList(new Student(10, "ram", 175),new Student(11, "raj", 115),new Student(12, "raghu", 135),new Student(13, "ravi", 190)));
	Predicate<Student> p1=s->s.marks>150;
	for(Student s1:l1) {
		if (p1.test(s1)) {
			System.out.println(s1);
		}
	}
}
}
