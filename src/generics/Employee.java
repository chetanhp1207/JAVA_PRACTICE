package generics;

import java.util.ArrayList;

public class Employee {
String ename;
int eid;
double esal;
public Employee(String ename,int eid,double esal) {
	this.ename=ename;
	this.eid=eid;
	this.esal=esal;
}
public static void main(String[] args) {
	ArrayList<Employee> l1=new ArrayList<Employee>();
	l1.add(new Employee("abc",101,4567.90));
	l1.add(new Employee("aaa",102,3456.65));
	for(int i=0;i<l1.size();i++) {
		Object o1=l1.get(i);
		Employee e1=(Employee)o1;
		System.out.println(e1);
	}
	}
public String toString() {
    return "Employee[emp_name=" + ename + ", employee_id=" + eid + ", employee_sal=" + esal + "]";
}
}
