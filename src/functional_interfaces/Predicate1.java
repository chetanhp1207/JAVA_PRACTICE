package functional_interfaces;

import java.util.function.Predicate;

public class Predicate1 {
public static void main(String[] args) {
	System.out.println("predicate with primitive datatypes");
	Predicate<Integer> p=n->n%2==0;
	System.out.println(p.test(5));
	System.out.println(p.test(8));
	
	System.out.println("\n\n non primitive datatypes \n\n Predicate with String");
	Predicate<String> p1=m->m.length()>5;
	
	System.out.println(p1.test("abcdeg"));
	System.out.println(p1.test("xyz"));
}
}
