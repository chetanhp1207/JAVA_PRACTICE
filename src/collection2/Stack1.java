package collection2;

import java.util.Stack;

public class Stack1 {
public static void main(String[] args) {
	Stack s1=new Stack();
	s1.add(10);
	s1.add("hii");
	s1.add(10.5);
	s1.add(20);
	s1.add('a');
	s1.add(3, 9);
	s1.remove(4);
	System.out.println(s1);
	System.out.println(s1.size());
	System.out.println(s1.isEmpty());
	//s1.clear();
	System.out.println(s1.contains(9));
	System.out.println(s1.get(3));
	s1.set(1, "hello");
	System.out.println(s1);
	Stack s2=new Stack();
	s2.add(10);
	s2.add("bye");
	s2.add(9);
	s2.add('c');
	s1.removeAll(s2);
	System.out.println(s1);
	s1.retainAll(s2);
	System.out.println(s1);
	s1.push(1);
	s1.push(2);
	System.out.println(s1);
	s1.pop();
	System.out.println(s1);
	
	
}
}
